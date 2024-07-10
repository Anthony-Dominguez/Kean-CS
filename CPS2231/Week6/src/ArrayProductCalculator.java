public class ArrayProductCalculator {
  public static int calculateProduct(int[] arr, int index) {
    if (index == arr.length - 1) {
      return arr[index];
    } else {
      return arr[index] * calculateProduct(arr, index + 1);
    }
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5};
    int result = calculateProduct(arr, 0);
    System.out.println("The product of the array is: " + result);
  }
}
