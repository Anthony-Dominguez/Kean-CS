import java.util.*;

public class Ch7Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of N : ");
        int n = input.nextInt();

        double[] array1 = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            array1[i] = input.nextDouble();

        }

        double total = 0;
        for (int i = 0; i < array1.length; i++) {
            total += array1[i];
        }
        double averg = total/n;

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (i<averg){
                count++;
            }
        }

        System.out.println("This is how many are greater than the average:"+ count);
        System.out.println("These is the average: " +averg );




    }
}
