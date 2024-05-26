import java.util.*;
public class Ch6Q1 {
    public static int reverseInt(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;

        }
        return reversed;
    }
    public static boolean isPalindrome(int number){
        return number == reverseInt(number);
        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number that you would like to reverse: ");
        int n1 = input.nextInt();
        System.out.println("The reversed number is: "+ reverseInt(n1));


        System.out.println("Enter number you want to check if its Palindrome: ");
        int n2 = input.nextInt();


        if (isPalindrome(n2) == true){
            System.out.println("The number "+ n2 +" is Palindrome");
        }else{
            System.out.println("The number "+ n2 +" is not Palindrome");
        }

    }

}
