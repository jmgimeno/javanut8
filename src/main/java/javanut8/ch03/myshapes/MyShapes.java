package javanut8.ch03.myshapes;

abstract class Polygon {
    protected final int sides;

    public Polygon(int sides) { this.sides = sides; }
    public int getSides() { return sides; }
    public abstract double area();
}

class Triangle extends Polygon {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() { return base * height / 2; }
}

class Square extends Polygon {
    private final double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double area() { return side * side; }
}

public class MyShapes {

    public static void main(String[] args) {
        // Always can up-cast
        Polygon poly = new Square(20.0);
        // Down-cast needs to be explicit
        Square square = (Square) poly;
        // Down-cast can fail at runtime
        //   throws ClassCastExcepction
        Triangle nono = (Triangle) poly;
        // Types must be compatible (does not compile)
        //    Inconvertible types; cannot cast
        // Triangle nonono = (Triangle) square;
    }
}
