package com.standard_practice.Standard.service;

import com.standard_practice.Standard.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Student createStudent(Student student);

    Student getStudentById(Long id);
}
