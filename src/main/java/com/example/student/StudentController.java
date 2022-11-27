package com.example.student;

import com.example.student.datamodel.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    StudentManager studentManager;

    @Autowired
    public StudentController(final StudentManager studentManager) {
        this.studentManager = studentManager;
    }

    @RequestMapping("/api/v1/students")
    public List<Student> getStudents() {
        return this.studentManager.getStudents();
    }
}
