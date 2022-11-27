package com.example.student;

import com.example.student.datamodel.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @RequestMapping("/api/v1/students")
    public List<Student> getStudents() {
        final ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Prathmesh", "1", "ppbodas@gmail.com"));
        return students;

    }
}
