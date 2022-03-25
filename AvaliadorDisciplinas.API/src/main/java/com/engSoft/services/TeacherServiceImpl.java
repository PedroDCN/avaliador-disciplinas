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
    public void saveTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher(teacherDTO);
        this.teacherRepository.save(teacher);
    }

    @Override
    public void removeTeacher(Long id) {
        this.teacherRepository.deleteById(id);
    }
    @Override
    public Optional<Teacher> updateTeacher(Long id, TeacherDTO teacherDTO){
        Optional<Teacher> teacher = this.teacherRepository.findById(id);

        if(teacherDTO.getPhoto().isEmpty() &&  !teacherDTO.getName().isEmpty()) teacher.get().setName(teacherDTO.getName());
        else if(teacherDTO.getName().isEmpty() && !teacherDTO.getPhoto().isEmpty()) teacher.get().setPhoto(teacherDTO.getPhoto());
        else {
            teacher.get().setName(teacherDTO.getName());
            teacher.get().setPhoto(teacherDTO.getPhoto());
        }
        this.teacherRepository.save(teacher.get());
        return teacher;
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
