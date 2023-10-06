package atu.cicd2.cicd2_week3_lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/registerUser/{name}/{email}")
    public void registerUsers(@PathVariable String name, @PathVariable String email){

    }
}
