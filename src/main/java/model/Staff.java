package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Staff {
    @Id @GeneratedValue
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    
}
