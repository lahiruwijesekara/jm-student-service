/**
 * 
 */
package com.javamastermind.student.domain;

import javax.validation.constraints.Size;

/**
 * @author lahiru_w
 */
public class Student
{

    private String studentId;

    @Size(min = 15, max = 20, message = "Incorrect length of studentName")
    private String studentName;

    private String age;

    private String address;

    private String contactNo;

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getContactNo()
    {
        return contactNo;
    }

    public void setContactNo(String contactNo)
    {
        this.contactNo = contactNo;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

}
