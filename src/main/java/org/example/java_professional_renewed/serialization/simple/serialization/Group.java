package org.example.java_professional_renewed.serialization.simple.serialization;

import java.io.Serializable;

/**
 * Created by Ivan Maksimchuk.
 */
public class Group implements Serializable {
    private String name;
    private transient Student student;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
