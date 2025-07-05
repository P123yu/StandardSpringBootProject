package com.standard_practice.Standard.mapper;

import com.standard_practice.Standard.co.StudentCo;
import com.standard_practice.Standard.dto.StudentDto;
import com.standard_practice.Standard.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto entityToDto(Student student);

    Student coToEntity(StudentCo studentCo);

    List<StudentDto> entityListToDtoList(List<Student> student);
}