package SV3;

import java.util.AbstractList;
import java.util.Collection;

public class CollectionsArrayList<E> extends AbstractList<E> {
    private int size;
    private int maxSize;
    private Object[] elements;

    CollectionsArrayList() {
        maxSize = 1;
        size = 0;
        elements = new Object[maxSize];
    }

    CollectionsArrayList(Collection<E> collection) {
        maxSize = collection.size();
        size = maxSize;
        elements = new Object[maxSize];

        int index = 0;
        for (E el : collection) {
            elements[index++] = el;
        }
    }

    CollectionsArrayList(E[] array) {
        maxSize = array.length;
        size = maxSize;
        elements = new Object[maxSize];

        for (int i = 0; i < size; i++) {
            elements[i] = array[i];
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return (E)elements[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        E el = (E)elements[index];
        elements[index] = element;
        return el;
    }

    @Override
    public boolean add(E element) {
        resizeIfNeeded();
        elements[size++] = element;
        return true;
    }

    @Override
    public void add(int index, E element) {
        resizeIfNeeded();
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        // Move all elements to the right
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        // Insert the new element
        elements[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        E removed = (E)elements[index];
        size--;

        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }

        return removed;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String out = "[";

        for (int i = 0; i < size; i++) {
            if (i > 0) out += ", ";

            out += String.valueOf(elements[i]);
        }

        return out + "]";
    }

//    Check if the array has reached its maximum size and double it
    private void resizeIfNeeded() {
        if (size >= maxSize) {
            maxSize *= 2;
            Object[] newEls = new Object[maxSize];

            for (int i = 0; i < size; i++) {
                newEls[i] = elements[i];
            }

            elements = newEls;
        }
    }
}
