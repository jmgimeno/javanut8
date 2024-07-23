package javanut8.ch04.myds;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[DEFAULT_SIZE];
        size = 0;
    }

    @Override
    public void add(int index, E element) {
        checkIndexForAdd(index);
        ensureCapacity();
        moveSuffixOneRight(index);
        elements[index] = element;
        size += 1;
    }

    @Override
    public E set(int index, E element) {
        checkIndexForAccess(index);
        @SuppressWarnings("unchecked")
        E oldElement = (E) elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndexForAccess(index);
        return (E) elements[index];
    }

    @Override
    public void remove(int index) {
        checkIndexForAccess(index);
        moveSuffixOneLeft(index);
        elements[size - 1] = null;
        size -= 1;
    }

    private void ensureCapacity() {
        if (size < elements.length) return;
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(
                    "adding at %d for a list of size %d".formatted(index, size));
    }

    private void checkIndexForAccess(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(
                    "accessing at %d for a list of size %d".formatted(index, size));
    }

    private void moveSuffixOneRight(int index) {
        // loop from right to left (the suffix moves one to the right)
        // index is the destination
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
    }

    private void moveSuffixOneLeft(int index) {
        // loop from left tp right (the suffix moves one to the left)
        // index is the destination
        for(int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < MyArrayList.this.size;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException(
                        "iterator has no more elements");
            @SuppressWarnings("unchecked")
            E next = (E) MyArrayList.this.elements[cursor];
            cursor += 1;
            return next;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyArrayList<?> other)) return false;
        if (obj == this) return true;
        if (size != other.size()) return false;
        for (int i = 0; i < size; i++) {
            if (!elements[i].equals(other.elements[i]))
                return false;
        }
        return true;
    }
}
