package com.standard_practice.Standard.service.impl;

import com.standard_practice.Standard.co.StudentCo;
import com.standard_practice.Standard.dto.StudentDto;
import com.standard_practice.Standard.mapper.StudentMapper;
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

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public StudentDto createStudent(StudentCo studentCo) {
        Student student=studentMapper.coToEntity(studentCo);
        student= studentRepository.save(student);
        return studentMapper.entityToDto(student);
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student student= studentRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("no any student found"));
        return studentMapper.entityToDto(student);
    }
}
