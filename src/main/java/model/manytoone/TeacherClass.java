package model.manytoone;


import jakarta.persistence.*;
import lombok.*;
import model.ClassEntity;
import model.Teacher;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Builder

public class TeacherClass {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private ClassEntity classEntity;


}
