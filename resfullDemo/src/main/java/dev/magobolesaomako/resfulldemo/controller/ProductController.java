package dev.magobolesaomako.resfulldemo.controller;

import dev.magobolesaomako.resfulldemo.model.Product;
import dev.magobolesaomako.resfulldemo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    /*
    A method to post a product
     */

    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return new ResponseEntity<>("Product added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<String> updateProductById(@PathVariable("id") long id,
                                                     @RequestBody Product updatedProduct) {
        if (productService.updateProduct(id, updatedProduct)) {
            return new ResponseEntity<>("product updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Product Not found", HttpStatus.NOT_FOUND);
        }
    }

    // Mapping to delete a product

    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable long id){
        if(productService.deleteProduct(id)){
            return new ResponseEntity<>("Product deleted succcessfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }
}
