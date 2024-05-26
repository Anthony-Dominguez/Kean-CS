import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;

        do {
            System.out.print("Enter a input: ");
            num1 = input.nextInt();
            if (num1 < 0){
                System.out.println("Loop Terminated");
            }else if (num1 > 50){
                System.out.println("Green");
            }else {
                System.out.println("Red");
            }
        } while (num1 >= 0);


//        System.out.println("Ascending order 0 to 200 that are divisible by 2 and 3");
//        for (int i = 1; i <200; i++) {
//            if (i % 2 == 0 && i % 3 == 0){
//                System.out.println(i + " ");
//            }
//
//        }

        for (int i = 1; i < 200; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}
