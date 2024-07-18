package javanut8.ch04.mygenerics;

public class ObjectContainer {
    private Object element;

    public Object set(Object newElement) {
        Object oldElement = element;
        element = newElement;
        return oldElement;
    }

    public Object get() {
        return element;
    }

    public boolean isEmpty() {
        return element == null;
    }

}
