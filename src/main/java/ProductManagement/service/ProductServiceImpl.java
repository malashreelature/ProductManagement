package ProductManagement.service;

import ProductManagement.entity.Product;
import ProductManagement.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class ProductServiceImpl implements ProductService{

        @Autowired
        private ProductRepo productRepo;

        @Override
        public List<Product> findAll() {
            return productRepo.findAll();
        }

        @Override
        public void saveProduct(Product product) {
            this.productRepo.save(product);
        }

        @Override
        public void deleteById(long id) {
            this.productRepo.deleteById(id);
        }

    @Override
    public Product update(Product product) {
        return product;
    }


}
