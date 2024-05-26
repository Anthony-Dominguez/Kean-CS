import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First name , year of birth , Last name");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        String s4 = s1.substring(0,3)+s2+s3.substring(0,3);
        System.out.println(s4);



    }
}
