package org.example.java_professional_renewed.cloning.ex_003_cloning.deep.cloning.with.constructor;

/**
 * Created by Ivan Maksimchuk.
 */
public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(20, "Alex");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
