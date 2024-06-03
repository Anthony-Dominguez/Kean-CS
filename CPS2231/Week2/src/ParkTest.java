class ParkUSA { // one public class in a file
    private String name;
    private String location;

    private static int totalParks = 0;
    private static ParkUSA[] parkArray = new ParkUSA[3];

    public ParkUSA() {
        this.name = "unknown";
        this.location = "unknown";
        totalParks++;
    }


    public ParkUSA(String name, String location) {
        this.name = name;
        this.location = location;
        totalParks++;
    }

    public ParkUSA(ParkUSA other) {
        this.name = other.name;
        this.location = other.location;
        totalParks++;
    }

    public static int getTotalParks() {
        return totalParks;
    }

    public static ParkUSA[] getParkArray() {
        return parkArray;
    }

    public static void setParkArray(ParkUSA[] parkArray) {
        ParkUSA.parkArray = parkArray;
    }

    //Override
    public String toString() {
        return "Name: " + name + " Location: " + location;
    }

    //Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParkUSA other = (ParkUSA) obj;
        return name.equals(other.name) && location.equals(other.location);
    }
}


class NationalPark extends ParkUSA {
    private int area;

    public NationalPark(String name, String location, int area) {
        super(name, location);
        this.area = area;
    }

    //Override
    public String toString() {
        return "National Park: " + super.toString() + " Area: " + area + " sq km";
    }
}

class StatePark extends ParkUSA {
    private String state;

    public StatePark(String name, String location, String state) {
        super(name, location);
        this.state = state;
    }


    public String toString() {
        return "State Park: " + super.toString() + " State: " + state;
    }
}

class CityPark extends ParkUSA {
    private int numberOfAttractions;

    public CityPark(String name, String location, int numberOfAttractions) {
        super(name, location);
        this.numberOfAttractions = numberOfAttractions;
    }


    public String toString() {
        return "City Park: " + super.toString() + " Number of Attractions: " + numberOfAttractions;
    }
}

public class ParkTest {
    public static void main(String[] args) {
        ParkUSA[] parkArray = new ParkUSA[3];

        parkArray[0] = new NationalPark("Yellowstone", "Wyoming", 8983);
        parkArray[1] = new StatePark("Central Park", "NY", "NY");
        parkArray[2] = new CityPark("Griffith Park", "LA", 30);

        ParkUSA.setParkArray(parkArray);

        for (ParkUSA parkUSA : ParkUSA.getParkArray()) {
            System.out.println(parkUSA.toString());
        }

        System.out.println("Total Parks: " + ParkUSA.getTotalParks());

        ParkUSA park1 = new NationalPark("Yellowstone", "Wyoming", 8983);
        ParkUSA park2 = new NationalPark("Yosemite", "Calif", 3081);

            System.out.println("Park 1 = Park 2 " + park1.equals(park2));

    }
}
