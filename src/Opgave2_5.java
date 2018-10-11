import java.util.Scanner;

public class Opgave2_5 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bill ");
        double bill = input.nextDouble();
        System.out.print("Enter the gratuity ");
        double gratuity = input.nextDouble();
        double gratuityCost = bill * (gratuity / 100);
        double totalCost = bill * gratuityCost;

        System.out.println("The gratuity is " + gratuityCost);
        System.out.print("The total cost is " + totalCost);


    }
}
