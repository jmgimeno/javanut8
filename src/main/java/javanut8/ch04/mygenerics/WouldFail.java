package javanut8.ch04.mygenerics;

import javanut8.ch04.myshapes.Polygon;
import javanut8.ch04.myshapes.Square;
import javanut8.ch04.myshapes.Triangle;

public class WouldFail {

    static void useContainer(Container<Polygon> container) {
        container.set(new Square(15.0));
    }

    public static void main(String[] args) {
        Container<Triangle> triangles = new Container<>();
        // useContainer(triangles);
        Triangle triangle = triangles.get();
    }
}
