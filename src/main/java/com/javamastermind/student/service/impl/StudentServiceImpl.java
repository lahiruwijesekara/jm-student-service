/**
 * 
 */
package com.javamastermind.student.service.impl;

import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.javamastermind.student.domain.ErrorResponse;
import com.javamastermind.student.domain.Student;
import com.javamastermind.student.domain.StudentResponse;
import com.javamastermind.student.model.StudentModel;
import com.javamastermind.student.repository.StudentRespository;
import com.javamastermind.student.service.StudentService;
import com.javamastermind.student.util.ErrorCodes;

/**
 * @author lahiru_w
 */
@Service
public class StudentServiceImpl implements StudentService
{

    @Autowired
    StudentRespository studentRespository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    ErrorCodes errorCodes;

    @Override
    public ResponseEntity<Object> addData(Student student)
    {
       if(studentRespository.existsById(student.getStudentId())) {
           
       }
        StudentModel studentModel = studentRespository.save(modelMapper.map(student, StudentModel.class));
        if (Objects.nonNull(studentModel.getStudentId())) {
            StudentResponse studentResponse = new StudentResponse();
            studentResponse.setStudentId(studentModel.getStudentId());
            studentResponse.setStudentName(studentModel.getStudentName());
            studentResponse.setStatus("Success");
            return new ResponseEntity<>(studentResponse, HttpStatus.ACCEPTED);
        } else {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setErrorCode(errorCodes.getSaveErrorCode());
            errorResponse.setErrorDescription(errorCodes.getSaveErrorMsg());
            return new ResponseEntity<>(errorResponse, HttpStatus.ACCEPTED);
        }
    }

}
