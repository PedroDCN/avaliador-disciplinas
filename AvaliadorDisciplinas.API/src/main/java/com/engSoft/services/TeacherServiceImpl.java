package com.engSoft.services;

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
    public void saveTeacher(Teacher teacher) {
        this.teacherRepository.save(teacher);
    }

    @Override
    public void removeTeacher(Teacher teacher) {
        this.teacherRepository.delete(teacher);
    }
    @Override
    public Optional<Teacher> updateTeacher(Long id, Teacher teacher){
        return null;
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
