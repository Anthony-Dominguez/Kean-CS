public class Tax {

    public static void main(String[] arg) {

        final double TAX_RATE = 0.07; // constant tax rate

        double income = 500;

        double tax = TAX_RATE * income;

        System.out.print("Your income tax is " + tax);
    }
}

