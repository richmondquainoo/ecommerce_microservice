package com.example.ecommerceproject.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
     private final ProductService productService;

     @GetMapping("/fetchAllProducts")
     @ResponseStatus(HttpStatus.OK)
     public List<Product> getAllProducts(){
         return productService.getAllProduct();
     }

     @GetMapping("/fetchProductByCategory/{category}")
     @ResponseStatus(HttpStatus.OK)
     public List<Product> getProductByCategory(@PathVariable String category){
          return productService.getProductByCategory(category);
     }

     @GetMapping("/fetchProductById/{id}")
     @ResponseStatus(HttpStatus.OK)
     public Product getProductById(@PathVariable Long id){
          return productService.getProductById(id);
     }

     @PostMapping("/createProduct")
     @ResponseStatus(HttpStatus.CREATED)
     public Product createProduct(@RequestBody Product product){
         return productService.saveProduct(product);
     }



}
