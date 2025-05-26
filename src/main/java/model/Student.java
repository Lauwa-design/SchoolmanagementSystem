package model;
import jakarta.persistence.*;


import java.util.Set;

@Entity
public class Student {
    @Id @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    @ManyToOne
    private ClassEntity classEntity;

    @ManyToMany
    private Set<Student> students;

}
