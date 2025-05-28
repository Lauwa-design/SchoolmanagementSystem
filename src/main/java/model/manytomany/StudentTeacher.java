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

   @ManyToOne
   private Teacher teacher;


   @ManyToOne
   private Student student;


}