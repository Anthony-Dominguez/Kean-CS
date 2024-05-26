import java.util.*;
public class Ch3Q1 {
    public static void main(String[] args) {
        System.out.println("Anthony Dominguez, 01,20,2024");
        System.out.println("");
//      Get inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
//      Check DNE
        double DNE = a * d - b * c;
//      Check if its 0 , else if not , do cramer's rule
        if (DNE == 0.0) {
            System.out.print("The equation has no solution");
        }else {
            double x = (d * e - b * f) / DNE;
            double y = (a * f - c * e) / DNE;
            System.out.println("x is " + x + " y is " + y);


        }
    }
}