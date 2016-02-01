/**
 * Created by Kenan Polat on 25.01.2016
 */

/******************************************************************************
 *  Compilation:  javac Dragon.java
 *  Execution:    java Dragon N
 *  
 *  Prints the instructions for drawing a dragon curve of orders N.
 * 
 *  % java Dragon 0
 *  F
 * 
 *  % java Dragon 1
 *  FLF
 * 
 *  % java Dragon 2
 *  FLFLFRF
 * 
 *  % java Dragon 3
 *  FLFLFRFLFLFRFRF
 * 
 *  % java Dragon 4
 *  FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
 * 
 *  % java Dragon 5
 *  FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
 *
 ******************************************************************************/

public class Dragon { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        String dragon = "F";
        String nogard = "F";
        String temp;

        for (int i = 1; i <= N; i++) {
            temp = dragon;                     // save away copy of dragon
            dragon = dragon + "L" + nogard;
            nogard = temp   + "R" + nogard;    // use old value of dragon
        }
        System.out.println(dragon);
    }

}
