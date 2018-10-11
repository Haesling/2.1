import java.util.Scanner;

public class Opgave2_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightIb = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightIn = input.nextDouble();
        double weightKg = weightIb * 0.45359237;
        double heightTM = heightIn * 0.0254;
        double BMI = (weightKg / (heightTM * heightTM));
        System.out.println("Your BMI is " + BMI);
    }
}
