package javanut8.ch04.mygenerics;

public class UseContainer {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.set("patata");
        String stringContained = stringContainer.get();
    }
}
