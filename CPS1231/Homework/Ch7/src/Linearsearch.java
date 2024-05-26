public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};


        System.out.println(findBig(arr,10));
    }

    public static int findBig(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }

        return -1;
    }

}
