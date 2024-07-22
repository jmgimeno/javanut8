package javanut8.ch04.myshapes;

public class Square extends Polygon implements Comparable<Square> {
    private final double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double area() { return side * side; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(side);
    }

    @Override
    public int compareTo(Square o) {
        return Double.compare(side, o.side);
    }
}
