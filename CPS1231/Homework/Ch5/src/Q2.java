
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Integer: ");
        int num = input.nextInt();

        System.out.print("Smallest factors of " + num + " are: ");

        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                System.out.print(factor + ",");
                num /= factor;
            } else {
                factor++;
            }
        }
    }
}
