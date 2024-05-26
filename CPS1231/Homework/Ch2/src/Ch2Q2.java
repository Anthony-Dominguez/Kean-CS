import java.util.Scanner;
public class Ch2Q2 {
    public static void main(String[] args) {

        System.out.println("Anthony Dominguez, 01,17,2024");
        System.out.println("");
//        Getting inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        double stotal = input.nextDouble();
        double gratuity = input.nextDouble();

//        calc tips and total
        double tips = (gratuity/100) * stotal;
        double total = (tips+stotal);
        System.out.println("The gratuity is $" + tips + " and total is $"+ total);
        input.close();

    }
}