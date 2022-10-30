package ProductManagement.service;

import ProductManagement.entity.Product;
import ProductManagement.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void saveUser(User user);
    void deleteById(Long id);

    User update(User user);
}
