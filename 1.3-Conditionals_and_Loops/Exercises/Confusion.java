/**
 * Created by Kenan Polat on 26.01.2016
 */

 /******************************************************************************
 *  Compilation:  javac Confusion.java
 *  Execution:    java Confusion
 *  
 *  Poorly written code intended to confuse your fellow programmer.
 *
 *  % java Confusion
 *  i = 10
 *  (i = i++) = 10
 *  (i = ++i) = 11
 *  (i = i++ + ++i) = 24
 *
 ******************************************************************************/

public class Confusion {

    public static void main(String[] args) { 
        int i = 10;
        System.out.println("i = " + i);

        i = i++;
        System.out.println("(i = i++) = " + i);

        i = ++i;
        System.out.println("(i = ++i) = " + i);

        i = i++ + ++i;
        System.out.println("(i = i++ + ++i) = " + i);
    }
}