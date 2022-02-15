package com.engSoft.services;

import com.engSoft.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    public void saveTeacher(Teacher teacher);
    public void removeTeacher(Teacher teacher);
    public Optional<Teacher> updateTeacher (Long id, Teacher teacher);
    public List<Teacher> listTeachers();
    public Optional<Teacher> getTeacherById(Long id);
    public Optional<Teacher> getTeacherByName(String name);
}
