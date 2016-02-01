/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac CartesianToPolar.java
 * Execution:    java CartesianToPolar x y
 * <p>
 * Read in Cartesian coordinates (x, y) and print out polar coordinates
 * (r, theta).
 * <p>
 * %  java CartesianToPolar 3.0 4.0
 * r     = 5.0
 * theta = 0.9272952180016122
 ******************************************************************************/

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println("r      = " + r);
        System.out.println("theta  = " + theta);
    }
}
