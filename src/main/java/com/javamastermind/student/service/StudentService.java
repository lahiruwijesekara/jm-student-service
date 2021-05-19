/**
 * 
 */
package com.javamastermind.student.service;

import org.springframework.http.ResponseEntity;

import com.javamastermind.student.domain.Student;

/**
 * @author lahiru_w
 */
public interface StudentService
{
    public ResponseEntity<Object> addData(Student student);
}
