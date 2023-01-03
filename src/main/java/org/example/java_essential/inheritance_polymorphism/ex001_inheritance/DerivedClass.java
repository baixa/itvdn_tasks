package org.example.java_essential.inheritance_polymorphism.ex001_inheritance;

/**
 * Наследование.
 */
public class DerivedClass extends BaseClass {
    // Конструктор.
    public DerivedClass() {
        // Изменяем все доступные поля унаследованные от базового класса.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
    }
}
