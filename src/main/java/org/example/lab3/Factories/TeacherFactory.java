package org.example.lab3.Factories;

import org.example.lab3.Model.Teacher;
import org.example.lab3.Model.TeacherType;

public class TeacherFactory {
    public static Teacher getStudent(TeacherType type) {
        switch (type) {
            default:
                return new Teacher();
        }
    }
}
