package ProductManagement.Controller;

import ProductManagement.entity.User;
import ProductManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User>getAllUser() {

        return userService.getAllUser();
    }

    @PostMapping("/save")
    public User saveProduct(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }


    @DeleteMapping(value = "delete/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        System.out.println("deleted User");
        userService.deleteById(id);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}

