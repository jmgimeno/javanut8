package javanut8.ch06;

// tag::COUNT[]
public class Counter {
    private int i = 0;

    public int increment() {
        return i = i + 1;
    }
    public int getCounter() { return i; }
}
//end::COUNT[]

