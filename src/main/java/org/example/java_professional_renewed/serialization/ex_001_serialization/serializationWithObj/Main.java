package org.example.java_professional_renewed.serialization.ex_001_serialization.serializationWithObj;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("C:\\Users\\Maksimchuk Ivan\\IdeaProjects\\itvdn\\src\\main\\java\\org\\example\\java_professional_renewed\\serialization\\ex_001_serialization\\serializationWithObj\\file3.txt");
        Car c = new Car(5000, "Bmw", new Engine(1500));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c);

            // Десериализуем объект Bmw с байт-кода
            Car newCar = (Car) ois.readObject();
            System.out.println(newCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
