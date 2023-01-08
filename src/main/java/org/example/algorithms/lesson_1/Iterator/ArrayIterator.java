package org.example.algorithms.lesson_1.Iterator;

import java.util.Iterator;

/**
 * Iterator for collections
 *
 * @param <E> elements
 */
public class ArrayIterator<E> implements Iterator<E> {

    /**
     * Index of iterator
     */
    private int index = 0;

    /**
     * Array of iterator elements
     */
    private E[] values;

    /**
     * Constructor
     *
     * @param values iterator elements
     */
    public ArrayIterator(E[] values) {
        this.values = values;
    }

    /**
     * Is iterator has next element.
     *
     * @return iterator has next element
     */
    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    /**
     * Get next element of iterator
     *
     * @return next element
     */
    @Override
    public E next() {
        return values[index++];
    }
}
