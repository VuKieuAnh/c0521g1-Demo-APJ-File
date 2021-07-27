package view;

import controller.StudentManager;
import model.Student;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Student> c05g = null;
        try {
            c05g = FileManager.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        StudentManager kieuAnh = new StudentManager("KA xinh", c05g);
        Student s = newStudent();
        try {
            kieuAnh.addNewStudent(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student s1: kieuAnh.getStudentList()
             ) {
            System.out.println(s1);
        }
    }
    public static Student newStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten di");
        String name = scanner.nextLine();
        Student student = new Student(name);
        return student;
    }
}
