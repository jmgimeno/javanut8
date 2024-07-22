package javanut8.ch04.myshapes;

import java.awt.*;

public class ColoredSquare extends Square {

    private final Color color;

    public ColoredSquare(double side, Color color) {
        super(side);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColoredSquare that)) return false;
        if (!super.equals(o)) return false;

        return color.equals(that.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

}
