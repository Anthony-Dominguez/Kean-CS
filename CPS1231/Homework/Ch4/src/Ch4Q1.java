import java.util.*;

public class Ch4Q1
{
    public static void main(String[] args)
    {
        System.out.println("Anthony Dominguez, 01,20,2024");
        System.out.println("");
//      get inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits: ");
        int digits = input.nextInt();


        String digitStr = Integer.toString(digits);

        for (int i = 0; i < digitStr.length(); i++){
            char c = digitStr.charAt(i);
            int num =Character.getNumericValue(c);
            int dne = 1;
            System.out.println(num*dne);

        }

    }
}