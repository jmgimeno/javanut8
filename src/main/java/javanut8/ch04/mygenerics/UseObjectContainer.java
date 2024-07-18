package javanut8.ch04.mygenerics;

public class UseObjectContainer {

    public static void main(String[] args) {
        ObjectContainer stringContainer = new ObjectContainer();
        stringContainer.set("patata");
        String stringContained = (String) stringContainer.get();

        stringContainer.set(new Object());
        String nonono = (String) stringContainer.get();
    }
}
