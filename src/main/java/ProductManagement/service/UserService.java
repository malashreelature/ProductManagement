package ProductManagement.service;

import ProductManagement.entity.User;
import ProductManagement.service.exception.BadCredentialsException;
import ProductManagement.service.exception.UserNotFoundException;

import java.util.List;

public interface UserService {

    void saveUser(User user);



    List<User> findAll(String email, String password)
            throws UserNotFoundException, BadCredentialsException;

    User getById(String email,String password,Long wallet)throws UserNotFoundException,
            BadCredentialsException;;

    String deleteById(String email, String password)throws  UserNotFoundException,
    BadCredentialsException;


    User findById(String email, String password, User user)throws UserNotFoundException,
            BadCredentialsException;
}
