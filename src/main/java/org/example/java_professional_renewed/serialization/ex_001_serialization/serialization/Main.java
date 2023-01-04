package org.example.java_professional_renewed.serialization.ex_001_serialization.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\src\\main\\java\\org\\example\\java_professional_renewed\\serialization\\ex_001_serialization\\serialization\\file2.txt");
        Car c = new Car(50000, "Bmw");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c);

            // Десериализуем объект Car с байт-кода
            Car car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
