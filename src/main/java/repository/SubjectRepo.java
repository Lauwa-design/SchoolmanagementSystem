package repository;

import model.Subject;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SubjectRepo extends JpaRepository< Subject , String>{
}
