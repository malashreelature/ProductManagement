package ProductManagement.service;

import ProductManagement.entity.Product;
import ProductManagement.entity.User;
import ProductManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;


    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(User user) {
        this.userRepo.save(user);


    }


    @Override
    public void deleteById(Long id) {
        this.userRepo.deleteById(id);

    }

    @Override
    public User update(User user) {
        return user;
    }
}
