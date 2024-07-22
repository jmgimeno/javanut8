package javanut8.ch04.myshapes;

import java.util.Comparator;

public class ByArea implements Comparator<Polygon> {
    @Override
    public int compare(Polygon o1, Polygon o2) {
        return Double.compare(o1.area(), o2.area());
    }
}


