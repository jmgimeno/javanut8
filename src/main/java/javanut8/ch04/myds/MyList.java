package javanut8.ch04.myds;

import java.util.Iterator;

public interface MyList<E> {
    void add(int index, E element);
    void get(int index);
    void remove(int index);
    int size();
    Iterator<E> iterator();
    default boolean isEmpty() {
        return size() == 0;
    }
}
