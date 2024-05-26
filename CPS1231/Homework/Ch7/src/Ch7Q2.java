import java.util.*;

public class Ch7Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter ten numbers
        System.out.print("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("This is the smallest element in index: "+indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }

}
