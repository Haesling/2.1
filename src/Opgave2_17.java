
import java.util.Scanner;

public class Opgave2_17 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between - 58F and 41F: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (> = 2) in miles per hour 6: ");
        double windspeed = input.nextDouble();
        double wci = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(windspeed,0.16)) + (0.4275 * fahrenheit * Math.pow(windspeed, 0.16));

        System.out.println("The wind chill index " + wci);

    }
}
