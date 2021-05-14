/**
 * 
 */
package com.javamastermind.student.domain;

/**
 * @author lahiru_w
 */
public class StudentResponse
{
    private String studentId;

    private String studentName;

    private String status;

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

}
