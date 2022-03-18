package com.engSoft.repositories;

import com.engSoft.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> getStudentByEmail(String email);
}
