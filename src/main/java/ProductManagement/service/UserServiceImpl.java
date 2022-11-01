package ProductManagement.service;

import ProductManagement.entity.User;

import ProductManagement.repository.UserRepository;
import ProductManagement.service.exception.BadCredentialsException;
import ProductManagement.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void saveUser(User user) {
        this.userRepository.save(user);


    }

    @Override
    public User update(User user,Long id) {
        User user1 = this.userRepository.findById(id).orElseThrow(
                () -> new RuntimeException(" Not Found"));
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1. setId(user.getId());
        this.userRepository.save(user1);
        User save = this.userRepository.save(user1);
        return user;
    }

    @Override
    public List<User> findAll(String username, String password) throws UserNotFoundException,
            BadCredentialsException {
        User user = (User) UserRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException
                (String.format("User with username %s not found", username)));
        if(!user.getPassword().equals(password)) throw new BadCredentialsException("Bad Credentials");
        return userRepository.findAll();
    }



    @Override
    public User getById(Long id) {
        User user=this.userRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Not Found"));
        return user;
    }

    @Override
    public void delete(Long id) {
        User user=this.userRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Not found"));
        this.userRepository.delete(user);

    }




}

