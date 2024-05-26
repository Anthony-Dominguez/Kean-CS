
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of N");
        int number = input.nextInt();


        int count = 1;
        int sum = 0;
        while (count <= number) {
            sum = sum+count;
            count++;
        }

        System.out.println("All added values:  "+ sum);
        }
    }
