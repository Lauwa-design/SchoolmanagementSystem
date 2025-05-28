package model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Student {
    @Id @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    @ManyToOne
    private ClassEntity classEntity;



}
