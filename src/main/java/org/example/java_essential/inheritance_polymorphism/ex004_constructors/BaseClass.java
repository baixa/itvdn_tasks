package org.example.java_essential.inheritance_polymorphism.ex004_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    public BaseClass(int number) {
        this.baseNumber = number;
    }
}
