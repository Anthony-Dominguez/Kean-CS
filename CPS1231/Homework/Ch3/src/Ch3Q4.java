
public class Ch3Q4 {
    public static void main(String[] args) {

        int a =5;int b=3;int c=6;

        double formula = b*b-4*a*c;

        if (formula > 0){
            System.out.println("Positive");
        } else if (formula < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
