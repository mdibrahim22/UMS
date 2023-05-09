package me.mdibrahim.UMS.Repository;

import me.mdibrahim.UMS.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
