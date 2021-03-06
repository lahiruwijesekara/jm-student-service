/**
 * 
 */
package com.javamastermind.student.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javamastermind.student.domain.Student;
import com.javamastermind.student.dto.StudentDto;
import com.javamastermind.student.service.StudentService;
import com.javamastermind.student.util.EndPoint;

/**
 * @author lahiru_w
 */
@RestController
@RequestMapping("/")
public class StudentController
{
    @Autowired
    StudentService studentService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping(value = EndPoint.ADD_STUDENT_DATA, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addStudentdata(@Validated @RequestBody StudentDto studentDto)
    {
        Student student = modelMapper.map(studentDto, Student.class);
        return studentService.addData(student);

    }
}
