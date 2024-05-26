import  java.util.*;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first;
        String last;
        String sQ;
        String year;


        System.out.print("Enter First name: ");
        first= input.next();
        System.out.print("Enter Last Name: ");
        last= input.next();
        System.out.print("(Security Question) Favorite car maker: ");
        sQ= input.next();
        System.out.print("Enter birth year: ");
        year= input.next();

       String email =  defaultInfo(first,last);
       String password = defaultInfo(first,sQ,year);
       resultScreen(first,last,email,password);
    }
    public static String defaultInfo(String first , String last){
        String email = first.charAt(0)+ "."+ last + "@kean.edu";
        email = email.toLowerCase();
        return email;
    }
    public static String defaultInfo(String first , String question , String year){
        String pw = first.substring(0,3) + year + question.substring(0,3);
        pw = pw.toUpperCase();
        return pw;
    }

    public static void resultScreen(String first , String last , String email, String password){

        System.out.println("========================================" );
        System.out.println(first + " "  + last);
        System.out.println("Kean email: " + email);
        System.out.println("Kean password: "+ password);
        System.out.println("========================================");
    }

}
