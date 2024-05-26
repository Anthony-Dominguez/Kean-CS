import java.util.*;
public class Assignment7 {
    public static void findGrade(int[] arr, int best){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>= best-10){
                System.out.println("Student " +i +" Grade A");
            } else if (arr[i]>= best-20) {
                System.out.println("Student " +i +" Grade B");
            } else if (arr[i]>= best-30) {
                System.out.println("Student " +i +" Grade C");
            } else if (arr[i]>= best-40) {
                System.out.println("Student " +i +" Grade D");
            }else{
                System.out.println("Student " +i +" Grade F");
            }

        }

    }

    public static void sortMarks(int[] arr){
        Arrays.sort(arr);
        for (int i:arr) {
            System.out.print(i + " ");

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total of Students: ");
        int n = input.nextInt();
        int[] grades = new int[n];
        int best =0;


        for (int i = 0; i < n; i++) {
            System.out.println("Enter Grades: ");
            grades[i] = input.nextInt();
            if (grades[i]>best){
                best = grades[i];
            }
        }


        findGrade(grades,best);
        sortMarks(grades);






    }

}
