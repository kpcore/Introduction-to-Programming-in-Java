/**
 * Created by Kenan Polat on 25.01.2016
 */

/******************************************************************************
 *  Compilation:  javac RulerN.java
 *  Execution:    java RulerN N
 *  
 *  Prints the relative lengths of the subdivisions on a ruler or
 *  order N.
 * 
 *  % java RulerN 3
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *
 *  % java RulerN 5
 *   1 
 *   1 2 1 
 *   1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 
 *   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 

 * 
 *  % java RulerN 100
 *  a lot of output, then
 *  Exception in thread "main" java.lang.OutOfMemoryError
 *
 ******************************************************************************/

public class RulerN { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        // ruler of order 0
        String ruler = " ";

        // repeat N times
        for (int i = 1; i <= N; i++) {

            // concatenate a ruler of order 0, the number i, and a ruler of order 0
            ruler = ruler + i + ruler;

            // print out the final result
            System.out.println(ruler);
        }

    }
}