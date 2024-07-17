package javanut8.ch04.myshapes;

public interface Translatable {
    Translatable deltaX(double dx);
    Translatable deltaY(double dy);
    Translatable delta(double dx, double dy);
}

