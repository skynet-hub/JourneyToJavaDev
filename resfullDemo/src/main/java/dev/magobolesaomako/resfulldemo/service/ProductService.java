package dev.magobolesaomako.resfulldemo.service;

import dev.magobolesaomako.resfulldemo.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Service
public class ProductService {

    //Method to retrieve all products
    //List simulating an in-memory database of products
    private final List<Product> products = new ArrayList<>();

    // Method to retrieve product by ID
    public Optional<Product> getProductById(Long id){
        return products.stream().filter(product -> product.getId() == id)
                .findFirst();
    }

    //Method to add new product
    public void addProduct(Product product){
        products.add(product);
    }

    // Method to update existing product
    public boolean updateProduct(Long id, Product updateProduct){
        Optional<Product> existingProduct = getProductById(id);
        if (existingProduct.isPresent()) {
            existingProduct.get().setName(updateProduct.getName());
            existingProduct.get().setPrice(updateProduct.getPrice());
            return true;
        }

        return false;
    }

    // Method to delete a product by ID
    public boolean deleteProduct(Long id){
        return products.removeIf(product -> product.getId() == id);
    }
}
