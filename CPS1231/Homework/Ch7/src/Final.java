import java.util.*;

public class Final {
    public static void main(String[] args) {

        //1.

//        int sum = 0;
//        for (int i = 12; i <= 21; i++) {
//            sum+=i;
//        }
//
//        System.out.println(sum);


        //2.

//        int sum = 0;
//        int i =22;
//
//        while (i<=31){
//            sum+=i;
//            i++;
//
//        }
//
//        System.out.println(sum);


        //3.

//        int sum = 0;
//        int i = 32;
//
//        do{
//            sum+=i;
//            i++;
//
//        }while (i<=41);
//
//        System.out.println(sum);


        //4

        Scanner input = new Scanner(System.in);
        int n= 5;

        int[] arr = new arr[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter numbers: ");
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        double averge = sum/n;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< averge){
                count++;
            }

        }


        System.out.println("count: "+ count);

        System.out.println("the averge "+ averge);

    }
}
