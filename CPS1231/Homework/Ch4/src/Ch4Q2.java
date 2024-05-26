import java.util.*;
import java.util.Arrays;

public class Ch4Q2
{
    public static void main(String[] args)
    {
        System.out.println("Anthony Dominguez, 01,20,2024");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String f_city = input.next();
        System.out.print("Enter the first city: ");
        String s_city = input.next();
        s_city += new String(" ");
        System.out.print("Enter the first city: ");
        String t_city = input.next();

        String[] cities= {f_city,s_city,t_city};
        Arrays.sort(cities);

        System.out.print("The three cities in alphabetical order are "+ cities[0]+cities[1]+cities[2]);


    }
}