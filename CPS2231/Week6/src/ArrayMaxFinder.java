public class ArrayMaxFinder {
  public static int findMax(int[] arr, int index){
    if(index == arr.length - 1){
      return arr[index];
  }else{
    int current = arr[index];
    int max = findMax(arr, index + 1);
    return Math.max(max, current);
  }
}

  public static void main(String[] args){
    int[] arr = {10, 5, 30, 4, 5};
    int result = findMax(arr, 0);

    System.out.println("The max of the array is: " + result);
  }
}
