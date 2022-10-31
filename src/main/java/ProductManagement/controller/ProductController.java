package ProductManagement.Controller;

import ProductManagement.entity.Product;
import ProductManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/product")

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/home")

    public String home() {
        return "welcome to DataPoem";
    }

    @GetMapping("/get")
    public List<Product> findAll() {

        return productService.findAll();
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return product;
    }


    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        System.out.println("deleted Product");
        productService.deleteById(id);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }
}