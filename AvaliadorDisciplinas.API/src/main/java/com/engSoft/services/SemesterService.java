package com.engSoft.services;

import com.engSoft.entities.Semester;

import java.util.List;
import java.util.Optional;

public interface SemesterService {

    public void saveSemester(Semester semester);
    public List<Semester> getAll();
    public void removeSemester(Semester semester);
    public Optional<Semester> findSemesterById(Long id);
    public Optional<Semester> findSemesterByName(String name);
}
