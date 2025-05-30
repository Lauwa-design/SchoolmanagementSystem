package service;

import lombok.RequiredArgsConstructor;
import model.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepo;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo studentRepo;

    public String createStudent(Student student) {
        studentRepo.save(student);
        return "student created successfully";

    }

    public Student getStudentByID(Integer studentID) {
        return studentRepo.findById(studentID).orElseThrow(() -> new RuntimeException("student not found"));

    }
}
