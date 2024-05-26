 class Car {


    private static final int DEFAULT_YEAR=2020;
    private static  int carCount;

    private String make;
    private String model;
    private int year;



    public Car(){
        this("Unknown", "Unknown" , DEFAULT_YEAR);

    }
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        carCount++;


    }

    public Car(Car other){
        this.make = other.make;
        this.model = other.model;
        this.year = other.year;
        carCount++;

    }
    public static int getCarCount(){
        return carCount;

    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;

    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public static int getDefaultYear(){
        return DEFAULT_YEAR;

    }

}

public class CarTest {
    public static void main(String[] args) {
        Car [] cars = new Car[3];
        cars[0] = new Car();
        cars[1] = new Car("Nissan" , "GTR" , 2024);
        cars[2] = new Car(cars[1]);

        System.out.println("Car count: " + Car.getCarCount()); // since is static u need the calss


        for (Car car : cars) {
            System.out.println("Make" + car.getMake() + ", Model:  " + car.getModel() + ", Year:  " + car.getYear());

        }

        System.out.println("Deafult year " + Car.getDefaultYear());


    }
}
