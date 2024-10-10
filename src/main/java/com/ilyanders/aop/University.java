package com.ilyanders.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Ilya Povetkin", 4, 4.4);
        Student student2 = new Student("Roman Povetkin", 1, 3.9);
        Student student3 = new Student("Aleksey Povetkin", 3, 5.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}

