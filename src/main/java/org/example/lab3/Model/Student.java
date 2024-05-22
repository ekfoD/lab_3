package org.example.lab3.Model;

import org.example.lab3.Interfaces.IStudent;

public class Student implements IStudent {
    private String name;
    private String id;
    private String group;

    public Student() {
    }

    // kaip ir nereikia sito controller nes naudojame Factory design pattern
    public Student(String name, String id, String group) {
        this.name = name;
        this.id = id;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void learnNewThings(int hours) {
        for (int i = 0; i < hours; ++i) {
            System.out.println("learning");
        }
    }
}
