import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value : ");
        double value = input.nextDouble();
        System.out.print("Enter 1 for sqrt , 2 for abs 3 for log : ");
        int select = input.nextInt();
        if (select == 1 ) {
            System.out.println("The sqrt of "+ value +" is " + Math.sqrt(value));
        }else if (select == 2) {
            System.out.println("The abs of "+ value +" is " + Math.abs(value));
        }else if (select == 3) {
            System.out.println("The log of "+ value +" is " + Math.log(value));
        }else {
            System.out.println("Run the program again!");
        }

        System.out.print("Enter a message: ");
        String message = input.next();

        System.out.println("The length of the message is "+ message.length());








    }
}
