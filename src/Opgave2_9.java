import java.util.Scanner;

public class Opgave2_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter velocity, ending velocity, and time ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("The average of acceleration is " + a );
    }
}
