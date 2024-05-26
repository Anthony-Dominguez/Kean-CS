import java.util.*;
public class Ch3Q2
{
    public static void main(String[] args)
    {
        System.out.println("Anthony Dominguez, 01,20,2024");
        System.out.println("");
//      get inputs
        Scanner input = new Scanner(System.in);
//      list
        String[] weekdays = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
//      getting todays date
        System.out.print("Enter Today's day: ");
        int tDay = input.nextInt();
//      elapsed days
        System.out.print("The number of days elapsed since today: ");
        int eDay = input.nextInt();
//      calc the future day
        int fDay = (tDay + eDay ) % 7;
//      index printing of an arrray

        System.out.println("Today is " + weekdays[tDay] +" the future day is " + weekdays[fDay]);


    }
}


