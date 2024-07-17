package javanut8.ch04.myshapes;

public class Triangle extends Polygon {
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
