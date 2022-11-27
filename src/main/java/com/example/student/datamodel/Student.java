package com.example.student.datamodel;

public class Student {
    String name;
    String id;
    String emailId;

    public Student() {
    }

    public Student(final String name, final String id, final String emailId) {
        this.name = name;
        this.id = id;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(final String emailId) {
        this.emailId = emailId;
    }
}
