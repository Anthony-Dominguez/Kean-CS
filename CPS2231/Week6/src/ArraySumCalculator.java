
public class ArraySumCalculator {

  public static int symArray(int[] arr, int index) {
    if(index == arr.length) {
      return 0;
    }else {
      return arr[index] + symArray(arr, index + 1);
    }
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int result = symArray(arr, 0);

    System.out.println("The sum of the array is: " + result);
  }
}
