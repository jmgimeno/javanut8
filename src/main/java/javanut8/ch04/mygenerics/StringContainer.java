package javanut8.ch04.mygenerics;

public class StringContainer {
    private String element;

    public String set(String newElement) {
        String oldElement = element;
        element = newElement;
        return oldElement;
    }

    public String get() {
        return element;
    }

    public boolean isEmpty() {
        return element == null;
    }
}
