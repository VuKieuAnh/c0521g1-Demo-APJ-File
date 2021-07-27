package storage;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void writeFile(List<Student> studentList) throws IOException {
        FileOutputStream fos = new FileOutputStream("dsc05g");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        oos.close();
        fos.close();
    }

    public static List<Student> readFile() throws IOException, ClassNotFoundException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("dsc05g");
        if (file.length()>0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            studentList = (List<Student>) o;
            ois.close();
            fis.close();
        }
        return studentList;
    }

//    public static void main(String[] args) {
//        try {
//            List<Student> studentList = readFile();
//            for (Student s:studentList
//                 ) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
}
