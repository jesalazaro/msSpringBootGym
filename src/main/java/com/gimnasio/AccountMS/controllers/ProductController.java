package com.gimnasio.AccountMS.controllers;

import com.gimnasio.AccountMS.models.Product;
import com.gimnasio.AccountMS.repositories.ProductRepository;


import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class ProductController {
    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/product/{productName}")
    public Optional<Product> getProduct(@PathVariable String productName) {
        return this.repository.findById(productName);
    }

    @PostMapping("/product")
    public Product newProduct(@RequestBody Product product){
        return this.repository.save(product);
    }

    @DeleteMapping("/product/{productName}")
    public void deleteProduct(@PathVariable String productName){
        repository.deleteById(productName);
    }

    @PutMapping("/product/{productName}")
    public Product updateProduct(@PathVariable String productName, @RequestBody Product new_product){
        Product old_product = repository.findById(productName).orElse(null);

        old_product.setProductName(new_product.getProductName());
        old_product.setPrice(new_product.getPrice());
        old_product.setUnits(new_product.getUnits());

        return repository.save(old_product);
    }












}
