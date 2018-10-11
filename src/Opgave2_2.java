import java.util.Scanner;

public class Opgave2_2 {

    public static void main(String[] args) {


        System.out.print("Enter the radius of the cylinder: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area of the cylinder is: " + area);
        System.out.print("The volume of the cylinder is: " + volume);
    }
}
