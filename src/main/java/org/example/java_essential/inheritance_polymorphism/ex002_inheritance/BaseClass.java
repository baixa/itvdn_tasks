package org.example.java_essential.inheritance_polymorphism.ex002_inheritance;

/**
 * Наследование.
 */
public class BaseClass {
    // Поля
    public String publicField = "BaseClass.publicField";
    private String privateField = "BaseClass.privateField";
    protected String protectedField = "BaseClass.protectedField";

    // Метод
    public void show() {
        System.out.println(privateField);
    }
}
