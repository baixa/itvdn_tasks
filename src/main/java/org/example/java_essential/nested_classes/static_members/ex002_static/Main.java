package org.example.java_essential.nested_classes.static_members.ex002_static;

/**
 * В статических методах нельзя обращаться к нестатическим полям.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1);

        NotStaticClass.method();
    }
}
