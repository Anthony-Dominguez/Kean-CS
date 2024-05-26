import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter numbers
        System.out.print("Enter numbers: ");
        // Read the first number as the initial smallest and largest value
        int number = scanner.nextInt();
        int smallest = number;
        int largest = number;

        // Read numbers until the user enters 0
        while (number != 0) {
            // Update smallest and largest if necessary
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            // Read the next number
            System.out.print("Enter number: ");
            number = scanner.nextInt();
        }

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);



    }
}
