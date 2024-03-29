/*
 * @(#) Point.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.polymorphism;

/**
 * @author      Dashchyk Andrey
 */
public class Point {
    private double x;
    private double y;

    // its more correct to make it explicit
    public Point() {
        this.x = 0;
        this.y =0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void drawInConsole() {
        System.out.println("It's drawing " + this.toString());
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
