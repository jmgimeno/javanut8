package javanut8.ch04.myshapes;

public abstract class Polygon {
    protected final int sides;

    public Polygon(int sides) { this.sides = sides; }
    public int getSides() { return sides; }
    public abstract double area();
}
