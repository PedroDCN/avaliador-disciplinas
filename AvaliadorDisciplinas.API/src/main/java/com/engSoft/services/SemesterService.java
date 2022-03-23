package com.engSoft.services;

import com.engSoft.entities.Semester;

import java.util.List;
import java.util.Optional;

public interface SemesterService {

    void saveSemester(Semester semester);
    List<Semester> getAll();
    void removeSemester(Semester semester);
    Optional<Semester> findSemesterById(Long id);
    Optional<Semester> findSemesterByName(String name);
}
