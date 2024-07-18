package javanut8.ch04.arrays;

public class Covariant {

    private static void boom(Object[] objects) {
        objects[0] = new Object();
    }

    public static void main(String[] args) {
        String[] strings = {"patata"};
        // Exception in thread "main"
        //   java.lang.ArrayStoreException: java.lang.Object
        boom(strings);
    }
}
