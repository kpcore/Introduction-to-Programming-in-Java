/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac Divisibility.java
 * Execution:    java Divisibility X Y
 * <p>
 * Reads in two command line inputs X and Y and prints "true" if both
 * are divisible by 7, and false otherwise.
 * <p>
 * % java Divisibility 14 21
 * true
 * <p>
 * % java Divisibility 4 21
 * false
 * <p>
 * % java Divisibility 100 200
 * false
 * <p>
 * a % 7 is the remainder when you divide 7 into a. If the remainder
 * is 0, then a is divisible by 7.
 ******************************************************************************/

public class Divisibility {
    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);

        boolean isDivisible = (X % 7 == 0) && (Y % 7 == 0);

        System.out.println(isDivisible);
    }
}
