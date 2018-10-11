import java.util.Scanner;

public class Opgave2_20 {

    public static void main(String[] args) {

       Scanner input = new Scanner (System.in);

        System.out.print("Enter the balance and intrestrate ");
        double balance = input.nextDouble();
        double annualIntrestRaterestRate = input.nextDouble();
        double interest = balance * (annualIntrestRaterestRate/1200);

        System.out.print("The interest is " + interest);


    }
}
