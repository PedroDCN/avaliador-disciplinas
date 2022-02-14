package com.engSoft.services;

import com.engSoft.entities.Student;
import com.engSoft.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentRepository.delete(student);

    }

    @Override
    public List<Student> listStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Optional<Student> getStudentByEmail(String email) {
        return studentRepository.getStudentByEmail(email);
    }
}
