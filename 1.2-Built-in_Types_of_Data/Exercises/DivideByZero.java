/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac DivideByZero.java
 * Execution:    java DivideByZero
 * <p>
 * Demonstrates what happens when you divide by zero with integers
 * and doubles.
 * <p>
 * % java DivideByZero
 * 17.0 / 0.0 = Infinity
 * 17.0 % 0.0 = NaN
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 ******************************************************************************/

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("17.0 / 0.0 = " + (17.0 / 0.0));  // infinity
        System.out.println("17.0 % 0.0 = " + (17.0 % 0.0));  // not a number
        System.out.println("17 / 0 = " + (17 / 0));          // ERROR
        System.out.println("17 % 0 = " + (17 % 0));          // ERROR
    }
}

