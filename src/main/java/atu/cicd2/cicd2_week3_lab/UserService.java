package atu.cicd2.cicd2_week3_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public void registerUser(String username, String email) {
        emailService.sendEmail(email, "Welcome to our platform " + username);
        System.out.println("Username: " + username +"    " + "Email: " + email);
    }
}
