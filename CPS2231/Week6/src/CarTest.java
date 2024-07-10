class Engine {
  private String type;

  public Engine(String type) {
    this.type = type;
  }
  public void start() {
    System.out.println("Engine started");
  }
  public void stop() {
    System.out.println("Engine stopped");
  }
  public String toString() {
    return "Engine type: " + type;
  }
}
class Car {
  private String brand;
  private Engine engine; // composition!!

  public Car(String brand, Engine engine) {
    this.brand = brand;
    this.engine = engine;
  }
  public void start() {
    System.out.println("Car started");
    engine.start();
  }
  public void stop() {
    System.out.println("Car stopped");
    engine.stop();
  }
  public String toString() {
    return "Car brand: " + brand + "\n" + engine.toString();
  }
}

public class CarTest {
public static void main(String[] args) {
  Engine engine = new Engine("V8");
  Car car = new Car("Toyota", engine); // Car has-a Engine
  System.out.println(car); 
  car.start();
  car.stop();
}
}
