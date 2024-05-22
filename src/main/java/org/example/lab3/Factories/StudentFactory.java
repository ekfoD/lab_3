package org.example.lab3.Factories;

import org.example.lab3.Model.Student;
import org.example.lab3.Model.StudentType;

public class StudentFactory {
    // galetume pagal enum reiksme grazinti ivairesniu students
    public static Student getStudent(StudentType type) {
        switch (type) {
            default:
                return new Student();
        }
    }
}
