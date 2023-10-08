package atu.cicd2.cicd2_week3_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService myUserService;

    @Autowired
    public void userRegister(UserService myUserService){
        this.myUserService = myUserService;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public void registerUsers(@PathVariable String name, @PathVariable String email){
        myUserService.registerUser(name, email);
    }

    @PostMapping("registerUserBody")
    @ResponseStatus(HttpStatus.CREATED)
    public User registerUserBody(@RequestBody User user) {
        System.out.println("User name: " + user.getName());
        System.out.println("User email: " + user.getEmail());
        return user;
    }
}
