package javanut8.ch04.myshapes;

public class CenteredCircle extends Circle implements Centered {
    private double cx, cy;

    public CenteredCircle(double r, double cx, double cy) {
        super(r); this.cx = cx; this.cy = cy;
    }

    @Override
    public void setCenter(double x, double y) {
        this.cx = x; this.cy = y;
    }

    @Override
    public double getCenterX() { return this.cx; }

    @Override
    public double getCenterY() { return this.cy; }
}
