import java.util.*;
public class Ch3Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Object[][] mDays =
                {
                {"January", 31},
                {"February" ,28},
                {"March",31},
                {"April", 30},
                {"May", 31},
                {"June", 30},
                {"July", 31},
                {"August", 31},
                {"September", 30},
                {"October", 31},
                {"November", 30},
                {"December", 31}
                };
//      get month and year
        System.out.print("Enter the Month and the Year: ");
//      -1 since it starts at index 0
        int month = input.nextInt() -1;
        int year = input.nextInt();
//      finding leep year needs to perfectly divided by 4 source google
        if (year % 4 == 0 ){
            System.out.println("Is a leep year");
            mDays[1][1] = 29;
        }else{
            System.out.println("Is not a leep year");
        }

        System.out.println(mDays[month][0]+" "+ year+" had " +mDays[month][1] +" days");

    }
}
