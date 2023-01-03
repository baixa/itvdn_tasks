package org.example.java_professional_renewed.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Ivan Maksimchuk.
 */
public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(Integer.valueOf(1), "one");
        identityHashMap.put(Integer.valueOf(11), "two");
        identityHashMap.put(Integer.valueOf(23), "three");
        identityHashMap.put(Integer.valueOf(1), "one");
        identityHashMap.put(Integer.valueOf(23), "five");

        Set set = identityHashMap.entrySet();

        for (Object o : set) {
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();
        identityHashMap.put(Integer.valueOf(1), "one");
        identityHashMap.put(Integer.valueOf(11), "two");
        identityHashMap.put(Integer.valueOf(23), "three");
        identityHashMap.put(Integer.valueOf(1), "one");
        identityHashMap.put(Integer.valueOf(23), "five");

        Set set2 = hashMap.entrySet();

        for (Object o : set2) {
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
