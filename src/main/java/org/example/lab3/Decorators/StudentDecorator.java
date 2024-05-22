package org.example.lab3.Decorators;

import org.example.lab3.Interfaces.IStudent;
import org.example.lab3.Interfaces.ITeacher;
import org.example.lab3.Model.Student;
import org.example.lab3.Model.Teacher;

// deka sito gali sujungti objektus arba prideti dar savo funkcionalumo
public class StudentDecorator implements IStudent, ITeacher {
    Teacher teacher;
    Student student;
    StudentDecorator(Teacher teacher, Student student) {
        this.teacher = teacher;
        this.student = student;
    }
    @Override
    public void learnNewThings(int hours) {
        student.learnNewThings(hours);
    }
    @Override
    public void teachKids(int hours) {
        teacher.teachKids(hours);
    }
}
