import java.util.*;

public class practice {

    public static void sortarr(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Elements for array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Elemets: ");
            arr[i] = input.nextInt();
        }

        sortarr(arr);

        System.out.println(Arrays.toString(arr));
        }

    }

