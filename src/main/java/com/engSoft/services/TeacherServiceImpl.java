package com.engSoft.services;

import com.engSoft.DTO.TeacherDTO;
import com.engSoft.entities.Teacher;
import com.engSoft.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher(teacherDTO);
        this.teacherRepository.save(teacher);
        return teacher;
    }

    @Override
    public void removeTeacher(Long id) {
        this.teacherRepository.deleteById(id);
    }

    @Override
    public Optional<Teacher> updateTeacher(Long id, TeacherDTO teacherDTO) {

        Teacher teacher = teacherRepository.getById(id);


        teacher.setName(teacherDTO.getName());
        teacher.setPhoto(teacherDTO.getPhoto());

        this.teacherRepository.save(teacher);
        return Optional.of(teacher);
    }

    @Override
    public List<Teacher> listTeachers() {
        return this.teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> getTeacherById(Long id) {
        return this.teacherRepository.findById(id);
    }

    @Override
    public Optional<Teacher> getTeacherByName(String name){return this.teacherRepository.getTeacherByName(name);}
}
