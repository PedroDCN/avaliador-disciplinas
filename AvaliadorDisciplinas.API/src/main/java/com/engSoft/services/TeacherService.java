package com.engSoft.services;

import com.engSoft.entities.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

    public void saveTeacher(Teacher teacher);
    public void removeTeacher(Long id);
    public Optional<Teacher> updateTeacher (Long id, String updatedAttribute);
    public List<Teacher> listTeachers();
    public Optional<Teacher> getTeacherById(Long id);
    public Optional<Teacher> getTeacherByName(String name);
}
