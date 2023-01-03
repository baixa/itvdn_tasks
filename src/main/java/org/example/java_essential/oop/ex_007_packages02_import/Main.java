package org.example.java_essential.oop.ex_007_packages02_import;


import org.example.java_essential.oop.ex_004_method_calling.Car;

public class Main {
    public static void main(String[] args) {
        // Если класс (Машина) лежит в другом пакете, то что бы его использовать в Классе Main - его надо импортировать
        Car myCar = new Car();
    }
}
