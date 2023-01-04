package org.example.java_professional_renewed.serialization.ex_002_externalizable;

import java.io.*;

/**
 * Created by Ivan Maksimchuk.
 */
public class Student implements Externalizable {
    private int id;
    private transient String username;

    public Student() {

    }

    public Student(int id, String username) {
        this.id = id;
        this.username = username;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(username);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        username = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan");
        File f = new File("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\src\\main\\java\\org\\example\\java_professional_renewed\\serialization\\ex_002_externalizable\\external.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
