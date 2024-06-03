import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        String[] candidates = new String[5];
        int[] votes = new int[5];
        Scanner input = new Scanner(System.in);
        // Input candidates
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the last name of candidate ");
            candidates[i] = input.nextLine();
            System.out.print("Enter the number of votes for:  " + candidates[i] + ": ");
            votes[i] = input.nextInt();
            // clear buffer
            input.nextLine();
        }

            // Calculate total votes
        int total = 0;
        for (int vote : votes) {
            total += vote;
        }

            // Calculate percentage
        double[] percentages = new double[5];
        int winner = 0;
        for (int i = 0; i < 5; i++) {
            percentages[i] = (votes[i] * 100.0) / total;
            if (votes[i] > votes[winner]) {
                winner = i;
            }
        }


            // Output
        System.out.printf("Candidate,    Votes Received,     of Total Votes");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n" +candidates[i]+"      " +  votes[i]+"      ");
            System.out.printf("%.2f", percentages[i]);;
        }
        System.out.println("\nTotal Votes: " + total);
        System.out.println("The Winner of the KU Election is " + candidates[winner] + ".");
    }
}
