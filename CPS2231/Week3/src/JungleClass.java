class Jungle {
    protected String name;
    protected int area;
    protected static int totalJungle;
    protected static Jungle[] jungleArray;

    public Jungle() {
        this.name = "Unknown";
        this.area = 0;
        totalJungle++;
    }
    public Jungle(String name, int area) {
        this.name = name;
        this.area = area;
        totalJungle++;
    }
    public Jungle(Jungle other){
        this.name = other.name;
        this.area = other.area;
        totalJungle++;
    }
    public static int getTotalJungle() {
        return totalJungle;
    }
    public static Jungle[] getJungleArray() {
        return jungleArray;
    }
    public static void setJungleArray(Jungle[] jungleArray) {
        Jungle.jungleArray  = jungleArray;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public void displayJungleInfo(){
        System.out.println("Jungle name: " + name);
        System.out.println("Jungle area: " + area);
    }
}

class Rainforest extends Jungle {
    private boolean hasCanopy;

    public Rainforest() {
        super();
        this.hasCanopy = false;
    }
    public Rainforest(String name, int area, boolean hasCanopy) {
        super(name, area);
        this.hasCanopy = hasCanopy;
    }
    public Rainforest(Rainforest other) {
        super(other);
        this.hasCanopy = other.hasCanopy;
    }
    public boolean hasCanopy () {
        return hasCanopy;
    }
    public void setHasCanopy(boolean hasCanopy) {
        this.hasCanopy = hasCanopy;
    }
    // override
    public void displayJungleInfo(){
        super.displayJungleInfo();
        System.out.println("Has canopy: " + hasCanopy);
    }
}

class TropicalJungle extends Jungle {
    private int humidity;

    public TropicalJungle() {
        super();
        this.humidity = 0;
    }
    public TropicalJungle(String name, int area, int humidity) {
        super(name, area);
        this.humidity = humidity;
    }
    public TropicalJungle(TropicalJungle other) {
        super(other);
        this.humidity = other.humidity;
    }
    public int hasHuminity () {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    // override
    public void displayJungleInfo(){
        super.displayJungleInfo();
        System.out.println("Humidity: " + humidity + "%");
    }
}
class DecidousJungle extends Jungle {
    private int temp;

    public DecidousJungle() {
        super();
        this.temp = 0;
    }
    public DecidousJungle(String name, int area, int temp) {
        super(name, area);
        this.temp = temp;
    }
    public DecidousJungle(DecidousJungle other) {
        super(other);
        this.temp = other.temp;
    }
    public int hasTemp () {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    // override
    public void displayJungleInfo(){
        super.displayJungleInfo();
        System.out.println("Temperature: " + temp + "C");
    }
}
public class JungleClass {
    public static void main(String[] args) {
        Jungle[] jungles = new Jungle[4];
        jungles[0]= new Rainforest("Amazon Rainforest" , 50000, true );
        jungles[1]= new TropicalJungle("Daintree Rainforest", 1200, 80);
        jungles[2]= new DecidousJungle("Black forest", 16000 , 15);
        jungles[3]= new Jungle("Any Forest", 50000);
        for(Jungle jungle: jungles){
            jungle.displayJungleInfo();
            System.out.println("-------------------------");
        }
        System.out.println("Total Jungles: " + Jungle.getTotalJungle());
    }
}
