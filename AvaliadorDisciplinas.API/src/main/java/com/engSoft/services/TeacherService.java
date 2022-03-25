package com.engSoft.services;

import com.engSoft.DTO.TeacherDTO;
import com.engSoft.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    public Teacher saveTeacher(TeacherDTO teacherDTO);
    public void removeTeacher(Long id);
    public Optional<Teacher> updateTeacher (Long id, TeacherDTO teacherDTO);
    public List<Teacher> listTeachers();
    public Optional<Teacher> getTeacherById(Long id);
    public Optional<Teacher> getTeacherByName(String name);
}
