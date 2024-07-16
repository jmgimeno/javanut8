package javanut8.ch03.mycshapes;

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
}
