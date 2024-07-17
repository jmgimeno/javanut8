package javanut8.ch04.myshapes;

public class Square extends Polygon {
    private final double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double area() { return side * side; }
}
