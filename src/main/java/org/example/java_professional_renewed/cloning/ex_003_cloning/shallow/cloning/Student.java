package org.example.java_professional_renewed.cloning.ex_003_cloning.shallow.cloning;

/**
 * Created by Ivan Maksimchuk.
 */
public class Student implements Cloneable {
    public String name;
    public int age;
    public Group group;

    Student() {

    }

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
