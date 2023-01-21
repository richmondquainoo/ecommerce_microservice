package com.example.ecommerceproject.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findProductById(id);
    }

    public List<Product> getProductByCategory(String category){
        return productRepository.findProductByCategory(category);
    }


    public Product saveProduct (Product product){
        return productRepository.save(product);
    }

}
