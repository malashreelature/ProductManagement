package ProductManagement.service;

import ProductManagement.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

       void saveProduct(Product product);
        void deleteById(long id);
    Product update(Product product);

    Product getById(Product product);
}

