package com.example.products.Adapters;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.ApplicationLayer.DTO.in.CreateCategoryRequest;
import com.example.products.ApplicationLayer.DTO.in.CreateProductDTO;
import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.example.products.ApplicationLayer.DTO.out.CreateCategoryResponse;
import com.example.products.ApplicationLayer.Services.ProductsService;


@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    public ProductsService productService;

    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody CreateProductDTO product){
        return ResponseEntity.ok(productService.createProduct(product));
    }

    @GetMapping("/get/type/{type}")
    public ResponseEntity<?> getByType(@PathVariable String type,  @RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size){
        return ResponseEntity.ok(productService.getByType(type, page, size));
    }

    @GetMapping("/get/id/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getById(id));
    }

    @GetMapping("/get/all")
    public ResponseEntity<?> getAllProducts(@RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size){
        return ResponseEntity.ok(productService.getAll(page, size));
    }

    @GetMapping("/get/discount")
    public ResponseEntity<?> getDiscount(@RequestParam(defaultValue = "0") int page,
    @RequestParam(defaultValue = "10") int size){
        return ResponseEntity.ok(productService.getDiscount(page, size));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO product) throws IOException{
        return ResponseEntity.ok(productService.updateProduct(product));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.deleteById(id));
    }

    @GetMapping("/types/products")
    public ResponseEntity<?> getTypesProducts(){
        return ResponseEntity.ok(productService.getTypes());
    }

    @PostMapping("/create/category")
    public ResponseEntity<CreateCategoryResponse> createCategory(@RequestBody CreateCategoryRequest createCategory) throws InterruptedException, IOException {
        return ResponseEntity.ok(productService.createCategory(createCategory));
    }

    @DeleteMapping("/delete/category/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) throws InterruptedException {
        return ResponseEntity.ok(productService.deleteCategory(id));
    }

    @GetMapping("/get/categories")
    public ResponseEntity<List<CreateCategoryResponse>> getCategories() throws InterruptedException{
        return ResponseEntity.ok(productService.getCategories());
    }

    @GetMapping("/get/products/filter")
    public ResponseEntity<List<ProductDTO>> getFilteredProducts(String type, Map<String, String> filteringConditions ) throws InterruptedException{
        return ResponseEntity.ok(productService.getFilterdProducts(type, filteringConditions));
    }

    
    

    
}
