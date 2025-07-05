package com.standard_practice.Standard.controller;

import com.standard_practice.Standard.model.Student;
import com.standard_practice.Standard.service.StudentService;
import com.standard_practice.Standard.util.ResponseUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<ResponseUtil<Student>> createStudent(@Valid @RequestBody Student student) {
        Student savedUser = studentService.createStudent(student);

        ResponseUtil<Student> response = ResponseUtil.<Student>builder()
                .status(HttpStatus.CREATED.value()) // Set status 201 in body
                .success(true)
                .message("Student created successfully")
                .data(savedUser)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response); // Set 201 in HTTP response
    }



    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseUtil<Student>> getStudentById(@PathVariable Long id) {
        Student savedUser = studentService.getStudentById(id);

        ResponseUtil<Student> response = ResponseUtil.<Student>builder()
                .status(HttpStatus.OK.value()) // Set status 200 in body
                .success(true)
                .message("Student fetched successfully")
                .data(savedUser)
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(response); // Set 200 in HTTP response
    }


}
