import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input status? Single or Married: ");
        String status = input.nextLine();

        System.out.print("Input Income amount: ");
        int income = input.nextInt();

        if (status.equals("Single")) {
            if (income > 20500) {
                System.out.println("Tax amount " +income * 0.25);
            } else if (income >= 10500 && income <= 20000) {
                System.out.println("Tax amount " +income * 0.15);
            } else {
                System.out.println("Tax amount " + income * 0.10);
            }
        } else if (status.equals("Married")) {
            if (income > 25000) {
                System.out.println("Tax amount " +income * 0.25);
            } else if (income >= 12500 && income <= 25000) {
                System.out.println("Tax amount " +income * 0.15);
            } else {
                System.out.println("Tax amount " +income * 0.10);
            }
        }
    }
}
