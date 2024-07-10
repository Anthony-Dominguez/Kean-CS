import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class HardwareStoreSorting {
    public static void main(String[] args) {
        HardwareTool[] records = readHardwareRecords("hardware_records.txt");
        if (records != null) {
            sortRecordsByName(records);
            writeSortedRecordsToFile(records, "sorted_hardware_records.txt");
        }
    }
    private static HardwareTool[] readHardwareRecords(String filename) {
        HardwareTool[] records = null;
        try (Scanner scanner = new Scanner(new File(filename))) {
            int numRecords = Integer.parseInt(scanner.nextLine());
            records = new HardwareTool[numRecords];

            for (int i = 0; i < numRecords; i++) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String itemName = fields[0];
                String ItemCode = fields[1];
                double price = Double.parseDouble(fields[2]);
                int quantity = Integer.parseInt(fields[3]);

                HardwareTool tool = new HardwareTool(itemName, ItemCode, price, quantity);
                records[i] = tool;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return records;
    }

    private static void sortRecordsByName(HardwareTool[] records) {
        Arrays.sort(records, Comparator.comparing(HardwareTool::getItemName));
    }

    private static void writeSortedRecordsToFile(HardwareTool[] records, String filename) {
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (HardwareTool tool : records) {
                writer.println(tool);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //nested class
    static class HardwareTool {
        private String itemName;
        private String itemCode;
        private double price;
        private int quantity;

        public HardwareTool(String itemName, String itemCode, double price, int quantity) {
            this.itemName = itemName;
            this.itemCode = itemCode;
            this.price = price;
            this.quantity = quantity;
        }

        public String getItemName() {
            return itemName;
        }

        public String getItemCode() {
            return itemCode;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String toString() {
            return itemName + ", " + itemCode + ", " + price + ", " + quantity;
        }
    }
}

