package javanut8.ch04.mygenerics;

public class Container<E> {
    private E element;

    public E set(E newElement) {
        E oldElement = element;
        element = newElement;
        return oldElement;
    }

    public E get() {
        return element;
    }

    public boolean isEmpty() {
        return element == null;
    }

}
