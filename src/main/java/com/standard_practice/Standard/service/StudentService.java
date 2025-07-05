package com.standard_practice.Standard.service;

import com.standard_practice.Standard.co.StudentCo;
import com.standard_practice.Standard.dto.StudentDto;
import com.standard_practice.Standard.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    StudentDto createStudent(StudentCo studentCo);

    StudentDto getStudentById(Long id);
}
