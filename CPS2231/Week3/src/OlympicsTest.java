

class Olympics {
    protected String hostCity;
    protected int year;
    protected static int totalOlympics;
    protected static Olympics[] olympicsArray;


    public Olympics() {
        this.hostCity = "";
        this.year = 0;
        totalOlympics++;
    }

    public Olympics(String hostCity, int year) {
        this.hostCity = hostCity;
        this.year = year;
        totalOlympics++;
    }
    public Olympics(Olympics other) {
        this.hostCity = other.hostCity;
        this.year = other.year;
        totalOlympics++;
    }
    public static int getTotalOlympics() {
        return totalOlympics;
    }
    public static Olympics[] getOlympicsArray() {
        return olympicsArray;
    }
    public static void setOlympicsArray(Olympics[] olympicsArray) {
        Olympics.olympicsArray = olympicsArray;
    }

    public String getHostCity() {
        return hostCity;
    }
    public void setHostCity(String hostCity) {
        this.hostCity = hostCity;

    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void displayHostCity() {
        System.out.println("Host City " + hostCity );
    }

    public String toString() { // string
        return "Olympics [hostCity=" + hostCity + ", year=" + year + "]";
    }
}

class SummerOlympics extends Olympics {

    int numberOfSports;
    public SummerOlympics() {
        super();
        this.numberOfSports = 0;
    }
    public SummerOlympics(String hostCity, int year, int numberOfSports) {
        super(hostCity, year);
        this.numberOfSports = numberOfSports;
    }
    public SummerOlympics(SummerOlympics other) {
        super(other);
        this.numberOfSports = other.numberOfSports;
    }

    public int getNumberOfSports() {
        return numberOfSports;
    }
    public void setNumberOfSports(int numberOfSports) {
        this.numberOfSports = numberOfSports;
    }

    public void displayHostCity() {
        System.out.println("Number City (summer olympics) " + hostCity);
    }
    public String toString() {
        return "SummerOlympics hostCity=" + getHostCity() + ", year= "+ getYear()+ ", numberOfSports= "+ numberOfSports;
    }

}
class WinterOlympics extends Olympics {
    int numberOfSports;
    public WinterOlympics() {
        super();
        this.numberOfSports = 0;
    }
    public WinterOlympics(String hostCity, int year, int numberOfSports) {
        super(hostCity, year);
        this.numberOfSports = numberOfSports;
    }
    public WinterOlympics(WinterOlympics other) {
        super(other);
        this.numberOfSports = other.numberOfSports;
    }

    public int getNumberOfSports() {
        return numberOfSports;
    }
    public void setNumberOfSports(int numberOfSports) {
        this.numberOfSports = numberOfSports;
    }

    public void displayHostCity() {
        System.out.println("Number City (winter olympics) " + hostCity);
    }
    public String toString() {
        return "Winter Olympics hostCity=" + getHostCity() + ", year= "+ getYear()+ ", numberOfSports= "+ numberOfSports;
    }

}

class YouthOlympics extends SummerOlympics {
    private int ageLimit;
    public YouthOlympics() {
        super();
        this.ageLimit = 0;
    }
    public YouthOlympics(String hostCity, int year, int numberOfSports, int ageLimit) {
        super(hostCity, year, numberOfSports);
        this.ageLimit = ageLimit;
    }
    public YouthOlympics(YouthOlympics other) {
        super(other);
        this.ageLimit = other.ageLimit;
    }
    public int getAgeLimit() {
        return ageLimit;
    }
    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }
    // Override
    public void displayHostCity() {
        System.out.println("Number City (Youth olympics) " + hostCity);
    }
    //Override
    public String toString() {
        return "Youth Olympics hostCity=" + getHostCity() + ", year= "+ getYear()+ ", numberOfSports= "+ getNumberOfSports()+  ", ageLimit= " + ageLimit;
    }

}










public class OlympicsTest {
    public static void main(String[] args) {


        Olympics  olympics0 = new SummerOlympics("Tokyo", 2010, 33);
        Olympics  olympics1 = new WinterOlympics("Beijing", 2022 ,15);
        Olympics  olympics2 = new YouthOlympics("Beijing", 2002 ,28, 16);


        System.out.println(olympics0);
        System.out.println(olympics1);
        System.out.println(olympics2);


        olympics0.displayHostCity();
        olympics1.displayHostCity();
        olympics2.displayHostCity();



    }


}
