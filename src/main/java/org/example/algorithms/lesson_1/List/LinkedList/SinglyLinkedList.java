package org.example.algorithms.lesson_1.List.LinkedList;

import java.util.Objects;

/**
 * Custom singly linked list
 * @param <E>
 */
public class SinglyLinkedList<E> {

    /**
     * Heading element
     */
    private Node<E> head;

    /**
     * Adds the given element to the list
     *
     * @param value - Given element
     */
    public void insert(E value) {
        Node<E> insertableElement = new Node<>(value);
        if (Objects.isNull(this.head)) {
            head = insertableElement;
        } else {
            Node<E> currentNode = head;
            while (!Objects.isNull(currentNode.getNextElement())) {
                currentNode = currentNode.getNextElement();
            }
            currentNode.setNextElement(insertableElement);
        }
    }

    /**
     * Adds the given element to the list as the heading element
     *
     * @param value - Given element
     */
    public void insertHead(E value) {
        Node<E> insertableElement = new Node<>(value);
        insertableElement.setNextElement(head);
        head = insertableElement;
    }

    /**
     * Adds the given element to the list at position index
     *
     * @param index - Index of insertable element
     * @param value - Given element
     */
    public void insertAt(int index, E value) {
        Node<E> insertableElement = new Node<>(value);
        Node<E> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextElement();
        }
        insertableElement.setNextElement(node.getNextElement());
        node.setNextElement(insertableElement);
    }

    /**
     * Delete the element from the list at position index
     *
     * @param index - Index of removable element
     */
    public void deleteAt(int index) {
        Node<E> node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextElement();
        }
        node.setNextElement(node.getNextElement().getNextElement());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (head != null) {
            Node<E> node = head;
            while(!Objects.isNull(node.getNextElement())) {
                builder.append(String.format("%s, ", node.getValue().toString()));
                node = node.getNextElement();
            }
            builder.append(String.format("%s]", node.getValue().toString()));
        }

        return builder.toString();
    }

}
