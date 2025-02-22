package com.example.getaway.Products.Adapters;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.getaway.Cart.Application.CartService;
import com.example.getaway.Products.Adapters.Convertors.toCategoriesCharacteristics;
import com.example.getaway.Products.Adapters.Convertors.toProductDTO;
import com.example.getaway.Products.Application.ProductService;
import com.example.getaway.Products.Application.DTO.in.CreateCategoryRequest;
import com.example.getaway.Products.Application.DTO.in.CreateProductDTO;
import com.example.getaway.Products.Application.DTO.in.CreateProductRequest;
import com.example.getaway.Products.Application.DTO.in.ProductDTO;
import com.example.getaway.Products.Application.DTO.in.UpdateProductRequest;
import com.example.getaway.Products.Application.DTO.out.CreateCategoryResponse;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.IOException;
import java.time.LocalDate;



@RestController 
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;
    

    @PostMapping(value ="/createProduct", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<CreateProductRequest> createProducts(@ModelAttribute CreateProductDTO createProduct,
    @RequestPart("photos") List<MultipartFile> photos,@RequestPart("mainPhoto") MultipartFile mainPhoto) throws InterruptedException, IOException {
        return productService.createProduct(createProduct, photos, mainPhoto);
    }

    @PostMapping("/create/category")
    public Mono<CreateCategoryResponse> createCategory(@RequestParam("name") String name,
    @RequestParam("url") String url,
    @RequestParam("image") MultipartFile image , @RequestParam Map<String, String> characteristicsType) throws InterruptedException, IOException {
        
            characteristicsType.remove("name");
            characteristicsType.remove("url");
            characteristicsType.remove("image");

            Map<String, List<String>> converted = toCategoriesCharacteristics.convertToCategoriesCharacteristics(characteristicsType);
           
            characteristicsType.forEach((key, value) -> {
                System.out.println("Key: " + key + ", Value: " + value);
            });
        CreateCategoryRequest createCategory = new CreateCategoryRequest(name, url, image.getBytes(), converted);
        return productService.createCategory(createCategory);
    }

    @DeleteMapping("/delete/category/{id}")
    public Mono<String> deleteCategory(@PathVariable Long id) throws InterruptedException {
        return productService.deleteCategory(id);
    }

    @GetMapping("/get/categories")
    public Mono<List<CreateCategoryResponse>> getCategories() throws InterruptedException{
        return productService.getCategories();
    }

    @GetMapping("/get/{type}")
    public Mono<?> getProductByType(@PathVariable String type, @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size) throws InterruptedException{
        return productService.getProductsByType(type, page, size);
    } 

    @GetMapping("/get/by/{id}")
    public Mono<ProductDTO> getProductById(@PathVariable Long id) throws InterruptedException{
        return productService.getProductById(id);
    }

    @GetMapping("/get/all")
    public Mono<?> getAllProducts(@RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size){
        return productService.getAllProducts(page, size);
    }

    @GetMapping("/get/discount")
    public Mono<?> getDiscount(@RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size){
        return productService.getDiscount(page, size);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<?> getDeleteProducts(@PathVariable Long id){
        return productService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Mono<?> updateProduct(@ModelAttribute UpdateProductRequest product,
    @RequestPart("photos") List<MultipartFile> photos,@RequestPart("mainPhoto") MultipartFile mainPhoto) throws IOException { 
        return productService.updateProduct(toProductDTO.convert(product, mainPhoto, photos));
    }

    @GetMapping("/get/types")
    public Mono<?> getProductsTypes(){
        return productService.getProductsTypes();
    }

    @GetMapping("/get/products/filter")
    public Mono<?> getFilteredProducts(String type, Map<String, String> filteringConditions ) throws InterruptedException{
        return productService.getFilterdProducts(type, filteringConditions);
    }


}
