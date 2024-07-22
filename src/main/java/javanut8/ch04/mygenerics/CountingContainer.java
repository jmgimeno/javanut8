package javanut8.ch04.mygenerics;

public class CountingContainer<E>
        extends Container<E> {

    private int counter = 0;

    @Override
    public E set(E newElement) {
        counter += 1;
        return super.set(newElement);
    }

    public int getCounter() {
        return this.counter;
    }
}
