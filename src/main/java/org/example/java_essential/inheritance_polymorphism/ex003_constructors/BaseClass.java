package org.example.java_essential.inheritance_polymorphism.ex003_constructors;

/**
 * Наследование.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор по умолчанию.
    public BaseClass() {
    }

    // Пользовательский конструктор.
    public BaseClass(int baseNumber) {
        this.baseNumber = baseNumber;
    }
}
