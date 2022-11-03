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
    public User findById(String email, String password,User user) throws
            UserNotFoundException, BadCredentialsException {
        User userFromDb =  userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException
                (String.format("User with username %s not found", email)));
        System.out.println("User from db: "+userFromDb);
        if (!userFromDb.getPassword().equals(password)) throw new BadCredentialsException("Bad Credentials");
        user.setId(userFromDb.getId());

       return userRepository.save(user);
    }


    @Override
    public List<User> findAll(String email, String password) throws UserNotFoundException,
            BadCredentialsException {
        User user =  userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException
                (String.format("User with username %s not found", email)));
        if (!user.getPassword().equals(password)) throw new BadCredentialsException("Bad Credentials");
        return userRepository.findAll();
    }

    @Override
    public User getById(String email, String password,Long wallet) throws UserNotFoundException,
            BadCredentialsException {
        User user =  userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException
                (String.format("User with username %s not found", email)));
        if (!user.getPassword().equals(password)) throw new BadCredentialsException("Bad Credentials");
        user.setWallet(wallet);
        return userRepository.save(user);
    }

    @Override
    public String deleteById(String email, String password) throws UserNotFoundException,
            BadCredentialsException {
        User user =  userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException
                (String.format("User with username %s not found", email)));
        if (!user.getPassword().equals(password)) throw new BadCredentialsException
                ("Bad Credentials");
        userRepository.deleteById(user.getId());
        return "Delete by id sucessfully";
    }



}







