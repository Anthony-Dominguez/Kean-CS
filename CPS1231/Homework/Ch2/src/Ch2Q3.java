import java.util.Scanner;

public class Ch2Q3 {
    public static void main(String[] args) {
        System.out.println("Anthony Dominguez, 01,17,2024");
        System.out.println("");
//        input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double lb = input.nextDouble();
//        conversion
        double kg = lb*0.454;
        System.out.println(lb + " pounds is " + kg + " kilograms");
        input.close();
    }
}
