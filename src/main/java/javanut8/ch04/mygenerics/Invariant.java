package javanut8.ch04.mygenerics;

import javanut8.ch04.myshapes.Polygon;
import javanut8.ch04.myshapes.Triangle;

public class Invariant {

    static void usePolygon(Polygon polygon) { }

    static void useContainer(Container<Polygon> container) { }

    public static void main(String[] args) {
        Container<Triangle> triangles = new Container<>();
        usePolygon(new Triangle(10.0, 20.0));
        // Does not compile !!
        //   Required type: Container<Polygon>, Provided: Container<Triangle>
        // useContainer(triangles);
    }
}
