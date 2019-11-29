/*
 * @(#) Main.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.polymorphism;

/**
 * Check methods for samples
 *
 * @author      Dashchyk Andrey
 */
public class Checker {
    private double radius;
    private double x1;
    private double y1;

    Checker(double radius, double x1, double y1) {
        this.radius = radius;
        this.x1 = x1;
        this.y1 = y1;
    }

    public void checkInheritance() {
        Point point = new Point();
        point.drawInConsole();

        Circle circle = new Circle(radius);
        circle.drawInConsole();

        Rectangle rectangle = new Rectangle(x1, y1);
        rectangle.drawInConsole();
    }

}
