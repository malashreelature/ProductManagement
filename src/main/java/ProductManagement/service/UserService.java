package ProductManagement.service;

import ProductManagement.entity.User;
import ProductManagement.service.exception.BadCredentialsException;
import ProductManagement.service.exception.UserNotFoundException;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(User user);


    User update(User user,Long id);

    List<User> findAll(String username, String password)
            throws UserNotFoundException, BadCredentialsException;

    User getById(Long id);

    void delete(Long id)throws RuntimeException;


}
