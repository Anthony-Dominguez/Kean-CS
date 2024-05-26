import java.util.Scanner;
public class Ch2Q1 {
    public static void main(String[] args) {

        System.out.println("Anthony Dominguez, 01,17,2024");
        System.out.println("");

//        inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial velocity: ");
        double v0 = input.nextDouble();

        System.out.print("Enter the ending velocity: ");
        double v1 = input.nextDouble();

        System.out.print("Enter the time: ");
        double t = input.nextDouble();
//        computing

        double a = (v1-v0)/t;
        System.out.print("The average acceleration is : ");
//        rounding 4 decimals
        System.out.format("%.4f", a);

//        close scanner
        input.close();
/**
 *
 *
 *
 *


 */
    }
}