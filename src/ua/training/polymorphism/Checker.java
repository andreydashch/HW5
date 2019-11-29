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
    private static final String SEPARATOR=
            "============================================";
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

        printlnSeparator();
    }

    public void checkPolymorphism() {
        Point point = new Point();
        point.drawInConsole();

        Point circle = new Circle(radius);
        circle.drawInConsole();

        Point rectangle = new Rectangle(x1, y1);
        rectangle.drawInConsole();

        printlnSeparator();
    }

    public void checkReassign() {
        Circle circle = new Circle(radius);
        Point circleAsPoint;

        circle.drawInConsole();
        circleAsPoint =circle;
        circleAsPoint.drawInConsole();
        System.out.println(circle.toString());
        System.out.println(circleAsPoint.toString());
        System.out.println(circle.getRadius());
        //System.out.println(circleThroughPoint.getRadius());

        printlnSeparator();
    }

    public void checkExtractionOfFields() {
        Circle circle = new Circle(radius);
        Point circle2 = new Circle(x1, y1, radius);

        //circle2 = new Point(3,8);
        //System.out.println(circle2.getRadius());
        Circle pointAsCircle = (Circle) circle2;
        System.out.println(pointAsCircle.getRadius());

        printlnSeparator();
    }

    public void checkExtractionOfFieldsByLoop() {
        Point[] points = {
                new Point(x1, y1),
                new Circle(x1, y1, radius),
                new Circle(x1, y1,radius + 1),
                new Rectangle(x1, y1)
        };
        for (Point currentPoint : points) {
            //System.out.println(currentPoint);
            if (currentPoint instanceof Circle) {
                Circle circleDefault = (Circle) currentPoint;
                System.out.println("radius = " + circleDefault.getRadius());
            }
        }

        printlnSeparator();
    }

    private void    printlnSeparator() {
        System.out.println(SEPARATOR);
    }
}
