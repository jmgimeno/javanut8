package javanut8.ch04.mygenerics;

import javanut8.ch04.myshapes.Polygon;
import javanut8.ch04.myshapes.Square;
import javanut8.ch04.myshapes.Triangle;

public class ExtendsWildcard {

    static double areaInside(Container<? extends Polygon> container) {
        return container.isEmpty() ? 0.0 : container.get().area();
    }

    public static void main(String[] args) {
        Container<Polygon> polygons = new Container<>();
        polygons.set(new Triangle(10.0, 15.0));
        System.out.println(areaInside(polygons));

        Container<Triangle> triangles = new Container<>();
        triangles.set(new Triangle(10.0, 15.0));
        System.out.println(areaInside(triangles));
    }
}
