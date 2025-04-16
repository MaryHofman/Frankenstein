package com.example.products.ApplicationLayer.Services;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.apache.tomcat.util.codec.binary.Base64;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.cartProto.Cart.ProductListItem;
import com.example.products.ApplicationLayer.DTO.in.CreateCategoryRequest;
import com.example.products.ApplicationLayer.DTO.in.CreateProductDTO;
import com.example.products.ApplicationLayer.DTO.in.ProductCheck;
import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.example.products.ApplicationLayer.DTO.out.CreateCategoryResponse;
import com.example.products.InfrastructureLayer.Entity.Products;
import com.example.products.InfrastructureLayer.Repository.CategoriesRepository;
import com.example.products.InfrastructureLayer.Repository.JpaCategoryRepository;
import com.example.products.InfrastructureLayer.Repository.ProductsRepository;
import com.example.shared.Service.Product;
import java.util.stream.Collectors;
import java.util.Map;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;
    
    @Autowired
    private ImageService imageService; 

    

    public CreateProductDTO createProduct(CreateProductDTO product){

        Products newProducts = new Products();
        
        newProducts.setColors(product.getColors());
        newProducts.setCharacteristics(product.getCharacteristics());
        newProducts.setName(product.getName());
        newProducts.setPrice(new BigDecimal(product.getPrice()));
        newProducts.setType(product.getType());
        newProducts.setQuantity(product.getQuantity());
        newProducts.setDiscount(product.getDiscount()!=null ? product.getDiscount() : "0");
        newProducts.setDescription(product.getDescription());
        
        List<String> namePhotos;

        List<byte[]> bytePhotos = new ArrayList<>();

        for (String photo : product.getPhotos()) {
            if (photo != null && !photo.isEmpty()) {
                bytePhotos.add(Base64.decodeBase64(photo));
            }
        }

        System.out.println(bytePhotos.size());
        
        try {
            String mainImage = imageService.sendOneImage(Base64.decodeBase64(product.getMainPhoto()), "main");
            namePhotos = imageService.sendListImages(bytePhotos, "photo");
            newProducts.setMainImage(mainImage);
            newProducts.setListImages(namePhotos);
            productsRepository.save(newProducts);

            product.setMainPhoto(mainImage);
            product.setPhotos(namePhotos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return product;
    }


    @Transactional
    public ProductDTO updateProduct(ProductDTO product ) throws IOException {

        System.out.println("Product ID: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Type: " + product.getType());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Discount: " + product.getDiscount());

        Products oldValue = productsRepository.findById(product.getId()).get();
        Products updateProduct = new Products();
        updateProduct.setId(product.getId());

        if(product.getMainImage()==null){
            updateProduct.setMainImage(oldValue.getMainImage());}
        else{
            imageService.deleteOneImage(oldValue.getMainImage());
            try {
            String newMainImage = imageService.sendOneImage(Base64.decodeBase64(product.getMainImage()), "category");
            updateProduct.setMainImage(newMainImage);
        } catch (IOException e) {
                e.printStackTrace();}}


        if(product.getListImages()==null){
            updateProduct.setListImages(oldValue.getListImages()); 
        }
        else{
            imageService.deleteListImages(oldValue.getListImages());
            List<String> urls = imageService.sendListImages(product.getListImages().stream()
            .map(e->Base64.decodeBase64(e)).collect(Collectors.toList()), "photos");
            updateProduct.setListImages(urls);
        }
        updateProduct.setMainImage(oldValue.getMainImage());
        updateProduct.setName(product.getName());
        updateProduct.setType(product.getType());
        updateProduct.setCharacteristics(product.getCharacteristics());
        updateProduct.setColors(product.getColors());
        updateProduct.setPrice(new BigDecimal(product.getPrice()));
        updateProduct.setQuantity(product.getQuantity());
        updateProduct.setDescription(product.getDescription());
        updateProduct.setDiscount(String.valueOf(product.getDiscount()));

        productsRepository.save(updateProduct);
        
        return product;
    }

    @Transactional
    public List<ProductDTO> getByType(String type, int page, int size) {
      
        Pageable pageable = PageRequest.of(page, size);
        Page<Products> products = productsRepository.findAllByType(type, pageable);
        products.forEach(product -> Hibernate.initialize(product.getListImages()));
        products.forEach(product -> Hibernate.initialize(product.getColors()));
        products.forEach(product -> {Hibernate.initialize(product.getCharacteristics());});

        String categoryName = categoriesRepository.findByUrl(type).getName();
        
        List<ProductDTO> productsDTO = new ArrayList<>();
        for (Products product : products) {
            ProductDTO dto = product.convertToProductDTO(product);

            dto.setNameCtegory(categoryName);
            productsDTO.add(dto);
        }
        
        return productsDTO;
    }


    @Transactional
    public List<Product> check(List<Product> products) {
        List<Product> checkedProducts= new ArrayList<>();
        for(Product p: products){
            Products findProducts = productsRepository.findById(p.getId()).get();
            
            if(findProducts.getQuantity()>= p.getQuantity()){
                
                int newQuantity = findProducts.getQuantity() - p.getQuantity();
                findProducts.setQuantity(newQuantity);
                productsRepository.save(findProducts);
                checkedProducts.add(p);
            }
            else{
                Product newProduct = p.toBuilder() 
                    .setQuantity(-1)  
                    .build();
                    checkedProducts.add(newProduct); 
            }
        }
        return checkedProducts;
    }

    public BigDecimal takeSum(List<Product> checkProducts) {
        BigDecimal sum = new BigDecimal("0");
        for(Product p : checkProducts){
            if(p.getQuantity()!=-1){
                BigDecimal added = productsRepository.findById(p.getId()).get().getPrice().multiply(new BigDecimal(p.getQuantity()));
                sum = sum.add(added);
            }
        }
        System.out.println("Sum   "+sum);
        return sum;
    }

    @Transactional
    public ProductDTO getById(long id) {
        Products product=null;
        try {
            product = productsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException());

            Hibernate.initialize(product.getListImages());
            Hibernate.initialize(product.getColors());
            Hibernate.initialize(product.getCharacteristics());

        } catch (NotFoundException e) {
            e.printStackTrace();
        } 
        
        String categoryName = categoriesRepository.findByUrl(product.getType()).getName();
        ProductDTO result = product.convertToProductDTO(product);
        result.setNameCtegory(categoryName);
        return result;
    }

    public List<ProductListItem> getProductsById(List<Long> productIdList) {
        List<ProductListItem> productListItem = new ArrayList<>();
        for(Long id :  productIdList){
           
            Products product = productsRepository.findById(id).get();
            ProductListItem.Builder newItem = ProductListItem.newBuilder();

            newItem.setId(product.getId());
            newItem.setListImage(product.getMainImage());
            newItem.setName(product.getName());
            newItem.setType(product.getType());
            newItem.setPrice(product.getPrice().toString());
            newItem.setQuantity(product.getQuantity());
            newItem.setDiscount(product.getDiscount());
            productListItem.add(newItem.build());

        }
        return productListItem;
    }

    @Transactional
    public List<ProductDTO> getAll(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Products> products = productsRepository.findAll(pageable);
        System.out.println("Length information   " + products.getSize());
        products.forEach(product -> Hibernate.initialize(product.getListImages()));
        products.forEach(product -> Hibernate.initialize(product.getColors()));
        products.forEach(product -> {Hibernate.initialize(product.getCharacteristics());});
        
        System.out.println("Length information   " + products.getSize());

        List<ProductDTO> productsDTO = new ArrayList<>();
        for (Products product : products) {
            System.out.println("Category type  "+product.getType());
            String categoryName = categoriesRepository.findByUrl(product.getType()).getName();
            ProductDTO dto = product.convertToProductDTO(product);
            dto.setNameCtegory(categoryName);
            dto.setListImages(product.getListImages());
            System.out.println("Discount   "+dto.getCharacteristics());
            productsDTO.add(dto);
        }
        return productsDTO;
    }

    public String deleteById(Long productId) {
            if (productsRepository.existsById(productId)) {
                Products product = productsRepository.findById(productId).get();
                imageService.deleteOneImage(product.getMainImage());
                imageService.deleteListImages(product.getListImages());
                productsRepository.deleteById(productId);
                // boolean flag = imageService.markAsUnavailable(productId);

                return "Product with ID " + productId + " was successfully deleted.";

            } else {
                return "Product with ID " + productId + " not found.";
            }}


    

    @Transactional
    public List<ProductDTO> getDiscount(int page, int size) {
  
        Pageable pageable = PageRequest.of(page, size);
        Page<Products> products = productsRepository.findAllDiscount(pageable);

        List<Products> filteredProducts = products.stream()
            .filter(p -> p.getDiscount() != null && !p.getDiscount().equals("0") && !p.getDiscount().equals(""))
            .collect(Collectors.toList());



        System.out.println("Length information   " + products.getSize());
        products.forEach(product -> Hibernate.initialize(product.getListImages()));
        products.forEach(product -> Hibernate.initialize(product.getColors()));
        products.forEach(product -> {Hibernate.initialize(product.getCharacteristics());});
        
        System.out.println("Length information   " + products.getSize());

        List<ProductDTO> productsDTO = new ArrayList<>();
        for (Products product : filteredProducts) {
            ProductDTO dto = product.convertToProductDTO(product);
            productsDTO.add(dto);
        }
        return productsDTO;
    }


    @Transactional
	public List<ProductDTO> search(String query) {
        List<Products> products = productsRepository.findAll();

        products.forEach(product -> Hibernate.initialize(product.getListImages()));
        products.forEach(product -> Hibernate.initialize(product.getColors()));
        products.forEach(product -> {Hibernate.initialize(product.getCharacteristics());});
        
        String lowerQuery = query.toLowerCase();

		List<Products> filterProducts = products.stream()
            .filter(product -> product.getName().toLowerCase().contains(lowerQuery))
            .collect(Collectors.toList());
        List<ProductDTO> productsDTO = new ArrayList<>();

        for (Products product : filterProducts) {
            ProductDTO dto = product.convertToProductDTO(product);
            productsDTO.add(dto);}
        return productsDTO;

}


    public List<String> getTypes() {
        return productsRepository.findAllDistinctTypes();
    }


    public CreateCategoryResponse createCategory(CreateCategoryRequest createCategory) throws IOException {
        String image = imageService.sendOneImage(createCategory.getImage(), "category");
        return categoriesRepository.saveCategory(createCategory, image);
    }


    public List<CreateCategoryResponse> getCategories() {
        return categoriesRepository.getAllCategories();
    }


    public String deleteCategory(Long id) {
        String result = categoriesRepository.deleteCategory(id);
        String deleteImage = imageService.deleteOneImage(result);
        return "Категория "+id+" была удалена";
    }


    public List<ProductDTO> getFilterdProducts(String type, Map<String, String> filteringConditions) {

        List<Products> products = productsRepository.findAll();

        List<ProductDTO> filteredProducts = products.stream()
        .filter(e->{
            boolean flag = true;

            for(Map.Entry<String,String> characteristic : filteringConditions.entrySet()){
                if(!e.getCharacteristics().get(characteristic.getKey()).equals(characteristic.getValue())){
                    flag = false;
                }
            }
            return flag;
        }).
        map(e-> e.convertToProductDTO(e)).collect(Collectors.toList());

        
        
        return filteredProducts;
    }
	}
   

    

