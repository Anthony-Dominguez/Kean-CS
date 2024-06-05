import java.security.DrbgParameters;
import java.security.spec.RSAOtherPrimeInfo;

class DisneyWorld{
    protected String name;
    protected int capacity;
    protected static int totalparks;
    protected static DisneyWorld[] parkArray;


    public DisneyWorld(){
        this.name = "unknown";
        this.capacity = 0;
        totalparks++;
    }
    public DisneyWorld(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        totalparks++;
    }
    public DisneyWorld(DisneyWorld other){
        this.name = other.name;
        this.capacity = other.capacity;
        totalparks++;
    }

    public static int getTotalparks(){
        return totalparks;
    }
    public static DisneyWorld[] getParkArray() {
        return parkArray;
    }
    public static void setParkArray(DisneyWorld[] parkArray) {
        DisneyWorld.parkArray = parkArray;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void displayParkInfo(){
        System.out.println("Park name: " + name);
        System.out.println("Capacity: " + capacity);
    }
}

class magicKingdom extends DisneyWorld{
    private int castHeight;

    public magicKingdom(){
        super();
        this.castHeight=0;
    }
    public magicKingdom(String name, int capacity, int castHeight){
        super(name, capacity);
        this.castHeight=castHeight;
    }
    public magicKingdom(magicKingdom other){
        super(other);
        this.castHeight=other.castHeight;
    }

    public int getCastHeight(){
        return castHeight;
    }
    public void setCastHeight(int castHeight){
        this.castHeight=castHeight;
    }
    //override

    public void displayParkInfo(){
        super.displayParkInfo();
        System.out.println("Castle Height: " + castHeight);
    }
}
class Epcot extends DisneyWorld{
    private boolean hasWorldShowcase;

    public Epcot(){
        super();
        this.hasWorldShowcase=false;
    }
    public Epcot(String name, int capacity, boolean hasWorldShowcase){
        super(name, capacity);
        this.hasWorldShowcase=hasWorldShowcase;
    }
    public Epcot(Epcot other){
        super(other);
        this.hasWorldShowcase=other.hasWorldShowcase;
    }

    public boolean getHasWorldShowcase(){
        return hasWorldShowcase;
    }
    public void setHasWorldShowcase(int castHeight){
        this.hasWorldShowcase=hasWorldShowcase;
    }
    //override
    public void displayParkInfo(){
        super.displayParkInfo();
        System.out.println("World Showcase: " + hasWorldShowcase);
    }
}

public class DisneyWorldTest {
    public static void main(String[] args) {
        DisneyWorld[] parks = new DisneyWorld[3];
        parks[0] = new magicKingdom("Magic Kingdom", 5000 ,189);
        parks[1] = new Epcot("Epcot" , 7000 , true);
        parks[2] = new Epcot("Epcot" , 5000 , false);
        DisneyWorld.setParkArray(parks);

        for (DisneyWorld park : DisneyWorld.getParkArray()){
            park.displayParkInfo();
            System.out.println("--------------------------");
        }

        System.out.println("Total parks "+ DisneyWorld.getTotalparks());

    }
}
