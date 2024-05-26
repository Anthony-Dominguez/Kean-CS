import java.util.Scanner;

public class Ch3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      list
        String[] weekdays = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
        System.out.print("Enter Today's day: ");
        int tDay = input.nextInt();

        System.out.println("Today is "+ weekdays[tDay]);


    }
}
