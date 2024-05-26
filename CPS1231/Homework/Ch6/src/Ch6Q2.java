public class Ch6Q2 {

    public static void main(String[] args) {
        System.out.println("Sales Amount   Commission");
        System.out.println("--------------------------");
        for (double salesAmount = 5000; salesAmount <= 100000; salesAmount += 5000) {
            System.out.println("$" + salesAmount + "           $" + computeCommission(salesAmount));
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission;
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }
        return commission;
    }
}
