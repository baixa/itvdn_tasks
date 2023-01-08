package org.example.algorithms.lesson_1.List.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insert("Test");
        singlyLinkedList.insert("Test1");
        singlyLinkedList.insert("Test2");
        singlyLinkedList.insert("Test3");
        singlyLinkedList.insert("Test4");

        System.out.println(singlyLinkedList);

        singlyLinkedList.deleteAt(1);

        System.out.println(singlyLinkedList);

        singlyLinkedList.insertAt(3, "Test adding at index");

        System.out.println(singlyLinkedList);

        singlyLinkedList.insertHead("Heading element");

        System.out.println(singlyLinkedList);

    }
}
