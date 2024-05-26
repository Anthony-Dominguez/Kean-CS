import java.util.*;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Target: ");
        int target = input.nextInt();

        inputArray(arr);
        printArray(arr);
        System.out.println("\nThis is the sum: "+ sum(arr));
        System.out.println("This is the max: "+ findMax(arr));
        System.out.println("this is the min: "+ findMin(arr));
        System.out.println("this is the Average: "+ findAverage(arr));
        System.out.println("this is search " + searchElement(arr, target));




    } public static void inputArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
    } public static void printArray(int[] arr) {

        for (int i : arr){
            System.out.print(i + " ");
        }
    }public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i =1; i < arr.length ;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i =1; i<arr.length;i++) {
            if (arr[i]< min) {
               min = arr[i];
            }
        }
        return min;

    }
    public static double findAverage(int[] arr) {
        int sum  = sum(arr);
        return (double) sum/arr.length;

    }
    public static boolean searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;

            }
        } return false;

    }
}

