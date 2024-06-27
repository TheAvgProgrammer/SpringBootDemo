package com.example.springbootdemo.services;

import com.example.springbootdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {
        String query = "insert into Student (rollNo, sname, marks) values (?,?,?); ";
        int rows = jdbcTemplate.update(query, s.getRollNo(), s.getsName(), s.getMarks());
        System.out.println(rows + " rows affected");
    }

    public List<Student> findAll() {
        String sql = "select*from Student";

        return jdbcTemplate.query(sql, (rs, rowNum) ->{
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setsName(rs.getString("sname"));
            s.setMarks(rs.getInt("marks"));
            return s;
        });
    }
}
