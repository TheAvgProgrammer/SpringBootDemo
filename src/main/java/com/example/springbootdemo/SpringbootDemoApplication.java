package com.example.springbootdemo;

import com.example.springbootdemo.model.Student;
import com.example.springbootdemo.services.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setMarks(100);
        s.setsName("Vamsi");
        s.setRollNo(59);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);
        System.out.println(service.getStudents());
    }
}
