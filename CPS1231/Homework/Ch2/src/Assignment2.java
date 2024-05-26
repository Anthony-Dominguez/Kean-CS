import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double investAnnual = input.nextDouble();
        System.out.print("Enter numbers of years: ");
        int years = input.nextInt();

        double futurevalue = (investAmount*((investAnnual/100)*years)) + investAmount;

        System.out.print("Future value is : ");

        System.out.print(futurevalue);
    }
}

