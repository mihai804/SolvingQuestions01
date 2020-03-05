package main;

/**
 * fahrenheitToCelsius
 *
 * This function convert temperature as double from Celsius to Fahrenheit
 *
 * @param is the temperature in Fahrenheit
 *
 * @return the temperature in degrees Celsius
 *
 * printTemperature
 *
 * Show temperature in degrees Fahrenheit and Celsius
 *
 * @param  is the temperature in degrees Fahrenheit as input
 *
 */

public class Question7 {
    public double fahrenheitToCelsius(double temperatureF) {
        double temperatureC = (temperatureF - 32.0) * 5.0/9.0;
        return temperatureC;
    }

    public void printTemperature(double temperatureF) {
        System.out.println("F: "+temperatureF);
        System.out.println("C: "+fahrenheitToCelsius(temperatureF));
    }
}
