package org.example.java_essential.classes_objects.ex_002_class_object_methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        // возвращает  ласс объекта
        System.out.println(car.getClass());

        // благодар¤ перезаписаному методу toString выведет информацию в нужном нам виде
        System.out.println(car);
    }
}
