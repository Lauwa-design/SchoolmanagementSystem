package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Teacher {
    @Id @GeneratedValue
    private int Id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @ManyToMany(mappedBy = "teachers")
    private Set<Student> students;

    @ManyToMany
    private Set<Subject> subjects;

    @ManyToMany
    private Set<ClassEntity> classes;




}
