import java.util.Scanner;

public class Opgave2_12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = (v * v) / (2 * a);

        System.out.println(" minimum runway length is " + length);

    }
}
