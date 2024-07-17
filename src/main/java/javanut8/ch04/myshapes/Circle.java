package javanut8.ch04.myshapes;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
