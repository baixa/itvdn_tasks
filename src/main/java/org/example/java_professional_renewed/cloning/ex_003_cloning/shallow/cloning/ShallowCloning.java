package org.example.java_professional_renewed.cloning.ex_003_cloning.shallow.cloning;

/**
 * Created by Ivan Maksimchuk.
 */
public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Ivan", 25, group);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);

            cloneStudent.name = "Robert";
            cloneStudent.group.id = 10;

            System.out.println("After cloning");

            System.out.println(student);
            System.out.println(cloneStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
