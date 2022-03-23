package com.engSoft.services;

import com.engSoft.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    void saveTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    Optional<Teacher> updateTeacher (Long id, Teacher teacher);
    List<Teacher> listTeachers();
    Optional<Teacher> getTeacherById(Long id);
    Optional<Teacher> getTeacherByName(String name);
}
