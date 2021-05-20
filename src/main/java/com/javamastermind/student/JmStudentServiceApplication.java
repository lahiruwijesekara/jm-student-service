package com.javamastermind.student;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.javamastermind.student.util.ErrorCodes;

@SpringBootApplication
@EnableConfigurationProperties(ErrorCodes.class)
public class JmStudentServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(JmStudentServiceApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

}
