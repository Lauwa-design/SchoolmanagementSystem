package repository;

import model.Staff;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface StaffRepo extends JpaRepository <Staff,String >{
}
