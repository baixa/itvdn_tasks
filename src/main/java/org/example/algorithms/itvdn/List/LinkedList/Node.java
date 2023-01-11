package org.example.algorithms.itvdn.List.LinkedList;

/**
 * Element of collections
 */
public class Node<E> {
    private E value;
    private Node<E> nextElement;

    public Node(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Node<E> nextElement) {
        this.nextElement = nextElement;
    }
}
