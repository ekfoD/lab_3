package org.example.lab3.Model;

import org.example.lab3.Factories.StudentFactory;

public class SingletonStudent {
    private static SingletonStudent instance;
    private Student student = StudentFactory.getStudent(StudentType.DEFAULT);

    private SingletonStudent() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static SingletonStudent getInstance() {
        if (instance == null) {
            instance = new SingletonStudent();
        }
        return instance;
    }
}
