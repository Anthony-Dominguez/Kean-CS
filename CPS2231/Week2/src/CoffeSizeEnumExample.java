import java.sql.SQLOutput;

public class CoffeSizeEnumExample {
    enum CoffeSize {
        SMALL(8, 1.99),
        Medium(12, 2.49),
        LARGE(16, 2.99);


        private int ounces;
        private double prices;

        CoffeSize(int ounces, double prices) {
            this.ounces = ounces;
            this.prices = prices;
        }

        public int getOunces() {
            return ounces;

        }

        public double getPrices() {
            return prices;
        }


    }

    public static void main(String[] args) {

            CoffeSize myCoffe = CoffeSize.Medium;
        System.out.println("I ordered a "+ myCoffe + " coffe");
        System.out.println("Its " + myCoffe.getOunces() + " ounches and cost $" + myCoffe.getPrices());

        System.out.println("Available coffe sizes: ");
        for (CoffeSize size : CoffeSize.values()) {
            System.out.println(size + " " + size.getOunces() + " " + size.getPrices());
        }




    }
}
