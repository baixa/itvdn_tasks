package org.example.java_professional_renewed.map;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ivan Maksimchuk.
 */
public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);
        enumMap.put(Animal.CAT, "C");
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");

        Set set = enumMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, BIRD
}
