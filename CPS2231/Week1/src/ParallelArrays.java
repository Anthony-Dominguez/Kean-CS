import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ParallelArrays {
    public static void main(String[] args) {
        Scanner input   =  new Scanner(System.in);
        // parallel Array
        String[] studentName = new String[5];
        Double[] examsScores = new Double[5];
        char [] letterGrade = new char[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.print("Enter name of student " + (i+1)+": ");
            studentName[i] = input.nextLine();
            System.out.print("Enter exam score for " + studentName[i] + ": ");
            examsScores[i] = input.nextDouble();
            input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            letterGrade[i] = calcaulateletter(examsScores[i]);
        }


//        Display student data
        System.out.println("\n Student data: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println("Name "+studentName[i]);
            System.out.println("Exam Score " + examsScores[i]);
            System.out.println("Letter Grade " + letterGrade[i]);
            System.out.println(" ");
        }
        input.close();

    }

    public static char calcaulateletter(double score) {
        if (score >= 90) {
            return 'A';
        }else if (score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }else if (score >= 60) {
            return 'D';

        }else {
            return 'F';
        }
    }
}

