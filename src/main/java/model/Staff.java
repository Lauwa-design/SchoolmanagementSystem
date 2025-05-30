package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Staff {
    @Id @GeneratedValue
    private Integer Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    
}
