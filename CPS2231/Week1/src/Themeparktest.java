class Themepark {

    private static int parkCount = 0;
    private String parkName;
    private String location;
    private int numAttractions;

    // Default constructor
    public Themepark() {
        parkCount++;
    }

    // Parameterized constructor
    public Themepark(String parkName, String location, int numAttractions) {
        this.parkName = parkName;
        this.location = location;
        this.numAttractions = numAttractions;
        parkCount++;
    }

    // Copy constructor
    public Themepark(Themepark other) {
        this.parkName = other.parkName;
        this.location = other.location;
        this.numAttractions = other.numAttractions;
        parkCount++;
    }

    // Method to add an attraction
    public void addAttraction() {
        numAttractions++;
        System.out.println("An attraction has been added to " + parkName + ".");
    }

    // Static method to get park count
    public static int getParkCount() {
        return parkCount;
    }

    // Method to display park details
    public void displayPark() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Number of Attractions: " + numAttractions);
    }
}


public class Themeparktest {
         public static void main(String[] args) {
             Themepark park1 = new Themepark();
             Themepark park2 = new Themepark("Funland", "New Jersey", 10);
             Themepark park3 = new Themepark(park2);

             park1.addAttraction();
             park2.addAttraction();
             park3.addAttraction();


             park1.displayPark();
             park2.displayPark();
             park3.displayPark();


             int totalParks = Themepark.getParkCount(); // since is not static

             System.out.println("Total parks " + totalParks);

         }
     }




