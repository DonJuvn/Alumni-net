package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> , JpaSpecificationExecutor<Student> {

    @Query("SELECT p FROM Student p where "
            + "CONCAT(p.firstName, p.lastName, p.gradYear, p.faculty)"
            + " LIKE %?1%")
    public List<Student> findAll(String keyword);

}
