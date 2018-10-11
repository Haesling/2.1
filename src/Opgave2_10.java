import java.util.Scanner;

public class Opgave2_10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amout of water in kilograms: ");
        double M = input.nextDouble();
        double initialTemperature = input.nextDouble();
        double finalTemperature = input.nextDouble();
        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.print("The energy needed is " + Q);

    }
}
