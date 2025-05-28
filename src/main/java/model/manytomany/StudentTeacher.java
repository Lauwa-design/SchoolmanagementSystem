package model.manytomany;


import jakarta.persistence.*;
import lombok.*;
import model.Student;
import model.Teacher;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Builder
public class StudentTeacher{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToMany // what container ,join table??
    private Student student;

    @ManyToMany
    private Teacher teacher;


}