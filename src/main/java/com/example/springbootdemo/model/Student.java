package com.example.springbootdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int marks;
    private String sName;

    private  int rollNo;

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", sName='" + sName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
