package org.example.lab3.Model;

public class SingletonStudent {
    private static SingletonStudent instance;
    private Student student = new Student();

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
