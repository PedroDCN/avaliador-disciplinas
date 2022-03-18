package com.engSoft.services;

import com.engSoft.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public void saveStudent(Student student);
    public void removeStudent(Student student);
    public List<Student> listStudents();
    public Optional<Student> getStudentById(Long id);
    public Optional<Student> getStudentByEmail(String email);
}
