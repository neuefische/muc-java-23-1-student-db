package de.neuefische;

import students.Student;
import students.StudentDb;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Student " + i);
        }

        StudentDb studentDb = new StudentDb(students);

        System.out.println("All Students");
        System.out.println(studentDb);

        System.out.println();

        System.out.println("Random Student");
        System.out.println(studentDb.randomStudent());

        System.out.println();

        System.out.println("Student hinzufügen");
        System.out.println("Altes Array: " + studentDb);
        studentDb.addStudent(new Student(10, "Student 10"));
        System.out.println("Neues Array: " + studentDb);

        System.out.println();
        System.out.println("Student entfernen");
        System.out.println("Altes Array: " + studentDb);
        studentDb.removeStudent(new Student(2, "Student 2"));
        System.out.println("Neues Array: " + studentDb);
    }
}