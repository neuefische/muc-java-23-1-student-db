package students;

import java.util.Arrays;

public class StudentDb {

    private Student[] students;

    public StudentDb(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student randomStudent() {
        int randomIndex = (int) (Math.random() * students.length);
        return students[randomIndex];
    }

    public void addStudent(Student student) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }

    public void removeStudent(Student student) {
        Student[] newStudents = new Student[students.length - 1];
        int index = 0;
        for (Student currentStudent : students) {
            if (!currentStudent.equals(student)) {
                newStudents[index] = currentStudent;
                index++;
            }
        }
        students = newStudents;
    }

    @Override
    public String toString() {
        return "StudentDb{" +
               "students=" + Arrays.toString(students) +
               '}';
    }
}
