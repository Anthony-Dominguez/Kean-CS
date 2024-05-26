public class Ch7Q1 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomInt = (int) (Math.random() * 10);
            counts[randomInt]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(counts[i]+",");
        }
    }
}
