package org.example.java_professional_renewed.cloning.ex_003_cloning.deep.cloning.with.serialization;

import java.io.Serializable;

/**
 * Created by Ivan Maksimchuk.
 */
public class Cow implements Serializable {
    private String name;
    private int weight;
    private int age;

    public Cow() {
    }

    public Cow(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
