package org.example.java_professional_renewed.serialization.simple.serialization;

import java.io.*;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java");
        Student student = new Student(1, "Ivan");

        student.setGroup(group);
        group.setStudent(student);

        File f = new File("D:\\Java Professional Course_video\\009_Serialization_and_Clonning\\009_Samples\\src\\javaProfessional\\simple\\serialization\\output.txt");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
