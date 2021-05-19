/**
 * 
 */
package com.javamastermind.student.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javamastermind.student.model.StudentModel;

/**
 * @author lahiru_w
 */
@Repository
public interface StudentRespository extends MongoRepository<StudentModel, String>
{

}
