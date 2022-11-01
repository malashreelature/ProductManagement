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
    public List<User> findAll(String username, String password) throws UserNotFoundException,
            BadCredentialsException {
        return userService.findAll(username, password);
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable Long id) {
        User user = this.userService.getById(id);
        return user;
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable Long id) {
        User user1 = this.userService.update(user, id);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String ,String>> createProduct(@PathVariable long id){
        this.userService.delete(id);
        Map<String, String> message = Map.of("message", " deleted successfully");
        return  new ResponseEntity<>(message, HttpStatus.OK );
    }

}



