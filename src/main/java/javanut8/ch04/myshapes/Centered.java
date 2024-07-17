package javanut8.ch04.myshapes;

public interface Centered {
    void setCenter(double x, double y);
    double getCenterX();
    double getCenterY();
    default void move(double dx, double dy) {
        setCenter(getCenterX() + dx, getCenterY() + dy);
    }
}
