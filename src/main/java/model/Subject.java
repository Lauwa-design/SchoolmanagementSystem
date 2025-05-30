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
public class Subject {
    @Id @GeneratedValue
    private Integer id;
    private String subjectName;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Teacher teacher;


}
