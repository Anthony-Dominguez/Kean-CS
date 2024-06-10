import java.util.Arrays;
import java.util.Comparator;


abstract class Plumber{
    protected String name;
    protected String companyName;


    public static int numPlumbers;
    public static String[] companyNames;


    public Plumber(String name, String companyName){
        this.name = name;
        this.companyName = companyName;
        numPlumbers++;
    }

    public abstract void fixLeak();

    public static void sortPlumbers(Plumber[] plumbers){
        Arrays.sort(plumbers,Comparator.comparing(Plumber::getCompanyName));
    }

    public String getCompanyName(){
        return companyName;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Name: " + name + " Company Name: " + companyName;
    }
}

class ResidentialPlumber extends Plumber implements PerformService{

    public ResidentialPlumber(String name, String companyName){
        super(name, companyName);
    }
//    Override

    public void fixLeak(){
        System.out.println("Residential plumber fix leak");
    }
//    Override Interface method
    public void performService(){
        System.out.println("Residential plumber perform service");
    }
}

class CommercialPlumber extends Plumber implements PerformService{

    public CommercialPlumber(String name, String companyName){
        super(name, companyName);
    }
//    Override

    public void fixLeak(){
        System.out.println("Commercial Plumber plumber fix leak");
    }
    //    Override Interface method
    public void performService(){
        System.out.println("Commercial plumber perform service");
    }
}

interface PerformService{
    void performService();
}

public class PlumberTest {
    public static void main(String[] args) {
        Plumber[] plumbers = new Plumber[3];
        plumbers[0]= new ResidentialPlumber("John Doe", "ABC Plumbing");
        plumbers[1]= new CommercialPlumber("Bob Smith ", "XYZ Plumbing");
        plumbers[2]= new ResidentialPlumber("Mike Jay ", "DEF Plumbing");
        System.out.println("PLumber before sorting :\n ");
        for (Plumber plumber : plumbers){
            System.out.println(plumber);
            System.out.println("---------------------------------------------");
        }
        System.out.println("\nSorting plumbers by company name : \n");

        Plumber.sortPlumbers(plumbers);

        for (Plumber plumber : plumbers){
            System.out.println(plumber);
            System.out.println("---------------------------------------------");
        }
    }
}










