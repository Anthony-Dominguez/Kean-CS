import java.util.Scanner;

public class CleanAssignment {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");

        int value = input.nextInt();

        if (value > 0) {

            System.out.print("Your skin is Oily");

        } else if (value == 0) {

            System.out.print("Your skin is Normal");

        } else {

            System.out.print("Yor skin is Dry");

        }

    }
}


