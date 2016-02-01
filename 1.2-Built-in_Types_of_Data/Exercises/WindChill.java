/**
 * Created by Kenan Polat on 02.01.2016
 */

/******************************************************************************
 * Compilation:  javac WindChill.java
 * Execution:    java WindChill t v
 * <p>
 * Given the temperature t (in Fahrenheit) and the wind speed v
 * (in miles per hour), compute the wind chill w using the formula
 * from the National Weather Service.
 * <p>
 * w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 * <p>
 * Reference:  http://www.nws.noaa.gov/om/windchill/index.shtml
 ******************************************************************************/

public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind Speed = " + v);
        System.out.println("Wind Chill = " + w);
    }
}
