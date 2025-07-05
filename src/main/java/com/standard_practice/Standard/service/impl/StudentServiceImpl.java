package com.standard_practice.Standard.service.impl;

import com.standard_practice.Standard.model.Student;
import com.standard_practice.Standard.repository.StudentRepository;
import com.standard_practice.Standard.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("no any student found"));
    }
}
