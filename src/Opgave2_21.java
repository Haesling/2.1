import java.util.Scanner;

public class Opgave2_21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in procentage: ");
        double monthlyInterestRate = (input.nextDouble()/100) / 12;
        System.out.print("Enter number of years: ");
        int numberOfYear = input.nextInt();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYear * 12));

        System.out.print("Accumulated value is $ " + futureInvestmentValue);


    }
}
