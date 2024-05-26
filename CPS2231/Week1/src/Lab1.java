
public class Lab1 {
//    public static int getPentagonalNumber(int n){
//        return n * (3* n -1 ) / 2;
//    }

    public static void main(String[] args) {


//      q1  int positives = 0;
//        int negatives = 0;
//        int total = 0;
//        int count = 0;
//
//        while (true) {
//            System.out.print("Enter an integer (0 to end): ");
//            int num = input.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//
//            if (num > 0) {
//                positives++;
//            } else if (num < 0) {
//                negatives++;
//            }
//
//            total += num;
//            count++;
//        }
//
//        if (count == 0) {
//            System.out.println("No numbers are entered except 0");
//        } else {
//            double average = (double) total / count;
//            System.out.println("The number of positive numbers is " + positives);
//            System.out.println("The number of negative numbers is " + negatives);
//            System.out.println("The total is " + total);
//            System.out.println("The average is " + String.format("%.2f", average));
//        }


//        q2
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(""+ getPentagonalNumber(i));
//
//            if (i % 10 == 0) {
//                System.out.println(" ");
//
//        }



        int i =5;
        int j = 1;

        for ( j = 1; j < 7 ; j++) {
            i = i-2;
            System.out.println(" I = "+i  + " J = "+j);

        }
        System.out.println(j);

    }

}
