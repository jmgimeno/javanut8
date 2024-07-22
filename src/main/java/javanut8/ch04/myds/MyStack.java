package javanut8.ch04.myds;

public interface MyStack<E> {
    void push(E element);
    void pop();
    E top();
    int size();
    default boolean isEmpty() {
        return size() == 0;
    }
}
