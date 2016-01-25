/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac SumOfTwoDice.java
 * Execution:    java SumOfTwoDice
 * <p>
 * Generate 2 integers between 1 and 6, and print their sum.
 * <p>
 * %  java SumOfTwoDice
 * 5
 * <p>
 * %  java SumOfTwoDice
 * 9
 * <p>
 * %  java SumOfTwoDice
 * 3
 * <p>
 * %  java SumOfTwoDice
 * 11
 * <p>
 * %  java SumOfTwoDice
 * 8
 * <p>
 * %  java SumOfTwoDice
 * 7
 ******************************************************************************/

public class SumOfTwoDice {
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
    }
}

