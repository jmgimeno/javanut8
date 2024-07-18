package javanut8.ch04.mygenerics;

import javanut8.ch04.myshapes.Polygon;
import javanut8.ch04.myshapes.Triangle;

public class SuperWildcard {

    static void initWithTriangle(Container<? super Triangle> container) {
        container.set(new Triangle(10.0, 20.0));
    }

    public static void main(String[] args) {
        Container<Polygon> polygons = new Container<>();
        initWithTriangle(polygons);
        Triangle triangle = (Triangle) polygons.get();

        Container<Triangle> triangles = new Container<>();
        initWithTriangle(triangles);
        Triangle anotherTriangle = triangles.get();
    }
}
