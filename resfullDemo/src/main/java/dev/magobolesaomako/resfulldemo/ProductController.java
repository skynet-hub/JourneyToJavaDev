package dev.magobolesaomako.resfulldemo;

import org.springframework.http.HttpHeaders;
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

    private final static String FILE_PATH = "products.json";
    ObjectMapper mapper = new ObjectMapper();

    /*
    A method to post a product
     */

    @PostMapping("/products")
    public ResponseEntity<String> createProduct(@RequestBody Product product) {
        // Do something with the product
        // Read from the file and then write the products together with the newly added into the file
        List<Product> products = readProductsFromFile();
        products.add(product);
        writeToFile(products);

        return new ResponseEntity<>("Product created successfully: " + product.getName() + "\n",
                HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(readProductsFromFile(), HttpStatus.OK);
    }
    private List<Product> readProductsFromFile(){
        File file = new File(FILE_PATH);

        if (!file.exists()){
            return new ArrayList<>();
        }

        return mapper.readValue(file, new TypeReference<List<Product>>() {
        });
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
         List<Product> products = readProductsFromFile();
         for (Product product: products) {
             if (product.getId() == id) {
                 return new ResponseEntity<>(product, HttpStatus.OK);
             }
         }

         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    private void writeToFile(List<Product> products){
        File file = new File(FILE_PATH);
        mapper.writeValue(file, products);
    }
}
