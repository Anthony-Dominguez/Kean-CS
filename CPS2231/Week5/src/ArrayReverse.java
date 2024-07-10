import java.util.Arrays;
public class ArrayReverse {
    public static <T>  T[] reverseArray(T[] arr) {
        int length = arr.length;
        T[] reverse = Arrays.copyOf(arr,length);

        for (int i = 0;  i < length/2 ; i ++) {
            T temp = reverse[i];
            reverse[i] = reverse[length - i - 1];
            reverse[length - i - 1] = temp;
        }
        return reverse;
    }
    public static <T> void printArray(T[] arr) {
        for( T element : arr ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Integer [] intArr = {1,2,3,4,5};
        Double [] doubleArr = {1.0,2.0,3.0,4.0,5.0};
        String [] stringArr = {"apple","bananna","cherry","date"};
        Character [] CharArr = {'a','b','c','d'};

        System.out.println("Original Int Array");
        printArray(intArr);
        System.out.println("Reversed Int Array");
        printArray(reverseArray(intArr));

        System.out.println("Original Double Array");
        printArray(doubleArr);
        System.out.println("Reversed Double Array");
        printArray(reverseArray(doubleArr));

        System.out.println("Original String Array");
        printArray(stringArr);
        System.out.println("Reversed String Array");
        printArray(reverseArray(stringArr));

        System.out.println("Original Char Array");
        printArray(CharArr);
        System.out.println("Reversed Char Array");
        printArray(reverseArray(CharArr));
    }
}


