package javanut8.ch04.myshapes;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        var ints = List.of(1,2,3,4);
        int sum = 0;
        for (var i : ints) { // Lists are Iterables
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
