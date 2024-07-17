package javanut8.ch04.records;

import java.util.SortedSet;

public class Fibonacci {
    public static int slow(int n) {
        if (n <= 1) {
            return n;
        } else {
            return slow(n - 1) + slow(n - 2);
        }
    }

    public static int fast(int n) {
        return fastPair(n).first();
    }

    private static PairOfInts fastPair(int n) {
        if (n == 0) {
            return new PairOfInts(0, 1);
        } else {
            PairOfInts pair = fastPair(n - 1);
            return new PairOfInts(pair.second(), pair.first() + pair.second());
        }
    }
}
