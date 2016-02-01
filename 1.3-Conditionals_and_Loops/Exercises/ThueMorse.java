/**
 * Created by Kenan Polat on 26.01.2016
 */

 /******************************************************************************
 *  Compilation:  javac ThueMorse.java
 *  Execution:    java ThueMorse N
 *  
 *  Prints the Thue-Morse sequence, which is defined as follows
 *  
 *      Start with 0, and repeatedly flip all the bits and concatenate
 *      it onto the original string.
 *
 *  % java ThueMorse 0
 *  0
 * 
 *  % java ThueMorse 1
 *  01
 * 
 *  % java ThueMorse 2
 *  0110
 *
 *  % java ThueMorse 2
 *  01101001
 *
 *  % java ThueMorse 4
 *  0110100110010110
 *
 *  % java ThueMorse 5
 *  01101001100101101001011001101001
 *
 ******************************************************************************/

public class ThueMorse { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        String thue   = "0";
        String morse  = "1";
        String t, m;                     // temporary values

        for (int i = 1; i <= N; i++) {
            t = thue;                     // save away values
            m = morse;
            thue  += m;
            morse += t;
        }
        System.out.println(thue);
    }

}