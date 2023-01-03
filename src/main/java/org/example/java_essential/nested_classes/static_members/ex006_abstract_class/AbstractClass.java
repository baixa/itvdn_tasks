package org.example.java_essential.nested_classes.static_members.ex006_abstract_class;

public abstract class AbstractClass {
    // Статический фабричный метод.
    public static AbstractClass CreateObject() {
        return new ConcreteClass();
    }

    public abstract void method();
}

