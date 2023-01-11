package org.example.algorithms.itvdn.List;

/**
 * List interface, that define behavior of lists
 * @param <E>
 */
public interface List<E> extends Iterable<E>{

    /**
     * Add new element to list
     *
     * @param e addable element
     * @return addition is successful
     */
    boolean add(E e);

    /**
     * Remove element from list
     *
     * @param index index of removable element
     */
    void delete(int index);

    /**
     * Get element by its index
     *
     * @param index index of gettable element
     * @return element, which index equals passed
     */
    E get(int index);

    /**
     * Get amount of elements in list
     *
     * @return list's size
     */
    int size();

    /**
     * Replace element, that index match passed
     *
     * @param index index of replacement element
     * @param e insertable element
     */
    void replace(int index, E e);
}
