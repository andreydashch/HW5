/*
 * @(#) Main.java
 *
 * This software can be used by anyone
 * with no limit. But developer do not
 * granite its proper working.
 */


package ua.training.polymorphism;

/**
 * Polymorphism samples
 *
 * @author      Dashchyk Andrey
 */
public class Main {
    public static final double RADIUS = 0.5;
    public static final double X1 = 5;
    public static final double Y1 = 3;

    public static void main(String[] args) {
	    Checker main = new Checker(RADIUS, X1, Y1);

	    main.checkInheritance();

    }
}
