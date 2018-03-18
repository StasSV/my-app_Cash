package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.googlecode.ehcache.annotations.Cacheable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LecturesWorker {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    private static final String SQL_SELECT_STUDENT_BY_ID = "select id, pib, course from students where id = ?";
    @Cacheable(cacheName = "getStudentsByID")
    public Student getStudentsByID(int id){
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
                new RowMapper<Student>() {
                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();
                        student.setId(rs.getInt(1));
                        student.setPib(rs.getString(2));
                        student.setCourse(rs.getInt(3));
                        return student;
                    }
                },id);
    }
}
