import java.util.Scanner;

public class Opgave2_3 {

    public static void main(String[] args) {

        System.out.print("Enter a value for feet: ");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double meter = feet * 0.305;

        System.out.println(feet + " feet to meter " + meter);
    }
}
