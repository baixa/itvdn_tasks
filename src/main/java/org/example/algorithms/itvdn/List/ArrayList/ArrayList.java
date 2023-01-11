package org.example.algorithms.itvdn.List.ArrayList;

import org.example.algorithms.itvdn.Iterator.ArrayIterator;
import org.example.algorithms.itvdn.List.List;

import java.util.Iterator;

public class ArrayList<E> implements List<E> {

    private E[] elements;

    public ArrayList() {
        elements = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = elements;
            elements = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, elements, 0, temp.length);
            elements[elements.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        if (index >= elements.length)
            return;

        try {
            E[] temp = elements;
            elements = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, elements, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, elements, index, amountElementsAfterIndex);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public void replace(int index, E e) {
        if (index < elements.length)
            elements[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(elements);
    }
}
