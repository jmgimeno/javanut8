package javanut8.ch04.mygenerics;

public class Printer {

    public static <E> void print(Container<E> container) {
        System.out.println(container.isEmpty() ? "empty" : container.get());
    }

    public static void print2(Container<?> container) {
        System.out.println(container.isEmpty() ? "empty" : container.get());
    }
}
