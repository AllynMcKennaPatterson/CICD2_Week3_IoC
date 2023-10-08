package atu.cicd2.cicd2_week3_lab;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
