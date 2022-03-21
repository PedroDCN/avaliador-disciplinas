package com.engSoft.services;

import com.engSoft.entities.Semester;
import com.engSoft.repositories.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class SemesterServiceImpl implements SemesterService {

    @Autowired
    private SemesterRepository semesterRepository;

    @Override
    public void saveSemester(Semester semester) {
        semesterRepository.save(semester);
    }

    @Override
    public List<Semester> getAll() {
        List<Semester> list = semesterRepository.findAll();
        Collections.sort(list);
        return list;
    }

    @Override
    public void removeSemester(Semester semester) {
        semesterRepository.delete(semester);
    }

    @Override
    public Optional<Semester> findSemesterById(Long id) {
        return semesterRepository.findById(id);
    }

    @Override
    public Optional<Semester> findSemesterByName(String name) {
        return semesterRepository.findByName(name);
    }
}
