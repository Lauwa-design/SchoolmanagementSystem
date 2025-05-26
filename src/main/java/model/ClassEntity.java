package model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ClassEntity {
    @Id @GeneratedValue
    private int Id;
    private String className;

    @OneToMany(mappedBy = "ClassEntity")
    private Set<Student> students;

    @ManyToMany
    private Set<Teacher> teachers;


}
