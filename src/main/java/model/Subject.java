package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Subject {
    @Id @GeneratedValue
    private int Id;
    private String subjectName;

    @ManyToMany(mappedBy = "subjects")
    private Set<Teacher> teachers;

}
