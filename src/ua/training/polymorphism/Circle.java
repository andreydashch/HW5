/*
 * @(#) Circle.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.polymorphism;

/**
 * @author      Dashchyk Andrey
 */
public class Circle extends Point {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                '}';
    }
}
