import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class DunkinDonuts {
    public static void main(String[] args) {
        List<Donut> donuts = readDonutRecords("input1.txt");
        if (donuts != null) {
            sortedDonutsByName(donuts);
            writeSortedRecordToFile(donuts, "output1.txt");
        }
    }

    public static List<Donut> readDonutRecords(String filename) {
        List<Donut> donuts = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            int numDonuts = Integer.parseInt(scanner.nextLine().trim()); // Read the number of donuts
            for (int i = 0; i < numDonuts; i++) {
                String[] parts = scanner.nextLine().split(",");
                String name = parts[0].trim();
                String type = parts[1].trim();
                double price = Double.parseDouble(parts[2].trim());
                int quantity = Integer.parseInt(parts[3].trim());
                donuts.add(new Donut(name, type, price, quantity));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return donuts;
    }

    public static void sortedDonutsByName(List<Donut> donuts) {
        donuts.sort(Comparator.comparing(Donut::getName));
    }

    public static void writeSortedRecordToFile(List<Donut> donuts, String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (Donut donut : donuts) {
                writer.println(donut);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class Donut {
        private String name;
        private String type;
        private double price;
        private int quantity;

        public Donut(String name, String type, double price, int quantity) {
            this.name = name;
            this.type = type;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return name + "," + type + "," + price + "," + quantity;
        }
    }
}
