package org.example.java_professional_renewed.iterator.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(15);
        collection.add(112);
        collection.add(1242);
        collection.add(152);
        collection.add(1622);
        collection.add(1252);

        Iterator<Integer> iterator = collection.iterator();
    }
}
