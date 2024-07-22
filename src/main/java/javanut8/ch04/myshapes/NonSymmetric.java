package javanut8.ch04.myshapes;

import java.awt.*;

public class NonSymmetric {

    public static void main(String[] args) {
        ColoredSquare s1 = new ColoredSquare(10, Color.RED);
        Square s2 = new Square(10);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
}
