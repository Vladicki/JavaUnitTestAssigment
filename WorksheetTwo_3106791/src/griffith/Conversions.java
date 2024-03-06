// 3106791 Vladislav Iurev
package griffith;

// Class for various conversion methods
public class Conversions {

    // Method to convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(int celsius) {
        double far = celsius * 9 / 5 + 32;
        return far;
    }

    // Method to convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(int fahrenheit) {
        double cel = (fahrenheit - 32) * 5 / 9;
        return cel;
    }

    // Method to convert Miles to Kilometers
    public double milesToKilometer(int miles) {
        double km = miles * 1.6;
        return km;
    }

    // Method to convert Kilometers to Miles
    public double kilometerToMiles(int kilometer) {
        double ml = kilometer / 1.6;
        return ml;
    }

    // Method to switch all uppercase values to lowercase values
    public String upperCaseToLowerCase(String str) {
        return str.toLowerCase();
    }

    // Method to switch all lowercase values to uppercase values
    public String lowerCaseToUpperCase(String str) {
        return str.toUpperCase();
    }
}
