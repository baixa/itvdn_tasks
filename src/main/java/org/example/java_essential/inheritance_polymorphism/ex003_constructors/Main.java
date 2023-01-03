package org.example.java_essential.inheritance_polymorphism.ex003_constructors;

/**
 * Наследование
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass(1, 2);

        System.out.println(instance.baseNumber);
        System.out.println(instance.derivedField);
    }
}
