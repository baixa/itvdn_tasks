package org.example.java_essential.lists.ex_005_arrays.array_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // объявление списка
        ArrayList<String> arrayList = new ArrayList<>();

        // добавление элементов в список
        arrayList.add("Hello");
        arrayList.add("student");
        arrayList.add("would you?");

        System.out.println(arrayList);

        // добавление по индексу
        arrayList.add(0, "teacher");

        // удаление элементов по индексу
        arrayList.remove(1);

        // удаление элементов по значению
        arrayList.remove("would you?");

        System.out.println(arrayList);
    }
}
