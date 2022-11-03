package ProductManagement.controller;

import ProductManagement.entity.User;
import ProductManagement.service.UserService;
import ProductManagement.service.exception.BadCredentialsException;
import ProductManagement.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

    @RestController
    public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public User saveProduct(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }


    @GetMapping("/get")
    public List<User> findAll(@RequestHeader("email") String email, @RequestHeader("password") String password) throws UserNotFoundException,
            BadCredentialsException {
        return userService.findAll(email, password);
    }



    @PutMapping("/update")
    public User update(@RequestHeader("email") String email,@RequestHeader("password") String password,@RequestBody
      User user )throws UserNotFoundException, BadCredentialsException{

        System.out.println(user);
        return userService.findById(email, password ,user);
    }
    @PutMapping("/addMoney/{wallet}")
    public User addMoney(@RequestHeader("email") String email,@RequestHeader("password") String password,@PathVariable
                    Long wallet)throws UserNotFoundException, BadCredentialsException{
        return userService.getById(email, password, wallet);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestHeader("email") String email,@RequestHeader("password") String password)throws UserNotFoundException, BadCredentialsException{
        String status = userService.deleteById(email, password);
        return ResponseEntity.ok(status);
    }

}



