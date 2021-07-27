package controller;

import model.Student;
import storage.FileManager;

import java.io.IOException;
import java.util.List;

public class StudentManager {
    private String name;
    private List<Student> studentList;

    public void addNewStudent(Student s) throws IOException {
        studentList.add(s);
        FileManager.writeFile(studentList);
    }

    public StudentManager(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
