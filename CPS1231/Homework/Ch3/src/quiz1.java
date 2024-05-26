import java.util.Scanner;
//import scanner for user inputs
public class quiz1 {

    public static void main(String[] args) {

//        Scanner input
        Scanner input = new Scanner(System.in);
//        Getting user inputs
        System.out.print("Enter v1 and v2: ");
//        assigning inputs to int and double
        int v1 = input.nextInt();
        double v2 = input.nextDouble();

//        area formula pi*r*r
        System.out.println("Area of circle : " + 3.14*(v1*v1));
//        Perimeter 2*pi*r
        System.out.println("Perimeter of circle is : "+ 2*3.14*v1);
//        Area L*W
        System.out.println("Area of rectangle is : " + v1*v2);
//        Perimeter 2*(l+w)
        System.out.println("perimeter of rectangle is: "+ 2*(v1+v2));

    }
}
