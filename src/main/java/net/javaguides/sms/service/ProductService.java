package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();

    Product saveProduct(Product student);

    Product getProductById(Long id);

    Product updateProduct(Product student);

    void deleteProductById(Long id);
}