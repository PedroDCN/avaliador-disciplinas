package com.engSoft.services;

import com.engSoft.DTO.TeacherDTO;
import com.engSoft.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    Teacher saveTeacher(TeacherDTO teacherDTO);
    void removeTeacher(Long id);
    Optional<Teacher> updateTeacher(Long id, TeacherDTO teacherDTO);
    List<Teacher> listTeachers();
    Optional<Teacher> getTeacherById(Long id);
    Optional<Teacher> getTeacherByName(String name);
}
