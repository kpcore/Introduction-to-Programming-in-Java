/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac RandomInt.java
 * Execution:    java RandomInt N
 * <p>
 * Prints a pseudo-random integer between 0 and N-1.
 * Illustrate an explicit type conversion (cast) from double to int.
 * <p>
 * % java RandomInt 6
 * Your random integer is: 5
 * <p>
 * % java RandomInt 6
 * Your random integer is: 0
 * <p>
 * % java RandomInt 1000
 * Your random integer is: 129
 * <p>
 * % java RandomInt 1000
 * Your random integer is: 333
 ******************************************************************************/
public class RandomInt {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random();

        // a pseudo-random integer between 0 and N-1
        int n = (int) (r * N);

        System.out.println("Your random integer is: " + n);
    }
}
