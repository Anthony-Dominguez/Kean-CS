import java.io.*;
import java.util.*;

public class FileProcessing{
    public static void main(String[] args){
        List<String> records = new ArrayList<>();
        // read from the inpiut file
        try(Scanner scanner = new Scanner(new File("input.txt"))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                records.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        // process the records and calculate the results
        List<String> results = new ArrayList<>();

        for(String record : records){
            String [] fields = record.split(","); // array of tokens
            String firstName = fields[0];
            int age = Integer.parseInt(fields[2]);
            int salary = Integer.parseInt(fields[3]);
            int totalIncome = age * salary;
            results.add(firstName + ","  + totalIncome);
        }
        // sort the result by first field (first name)
        Collections.sort(results);

        // write the sortes results to output file
        try(PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))){
            for(String result : results){
                writer.println(result);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

