package model.manytoone;

import jakarta.persistence.*;
import lombok.*;
import model.Subject;
import model.Teacher;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Builder

public class SubjectTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    private Subject subject;

    @ManyToOne
    private Teacher teacher;
}