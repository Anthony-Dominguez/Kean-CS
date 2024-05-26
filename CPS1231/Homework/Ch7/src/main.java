import java.util.*;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number (Stops Input 0): ");

        int x = input.nextInt();
        int sum = 0;
        while (x != 0){
            System.out.print("Enter Number (Stops Input 0): ");
            x = input.nextInt();
            if (x % 2 ==0) {
                sum +=x;
            }
        }

        System.out.println("Sum : " + sum);

    }
}
