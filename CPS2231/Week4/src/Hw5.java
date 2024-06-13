//1)
//class YClass {
//    private int a;
//    private int b;
//
//    // Default constructor to initialize instance variables to 0
//    public YClass() {
//        this.a = 0;
//        this.b = 0;
//    }
//    public void one() {
//        // Method implementation (can be left empty or have some logic)
//    }
//
//    // Method to initialize instance variables a and b
//    public void two(int x, int y) {
//        this.a = x;
//        this.b = y;
//    }
//}
//
//class XClass extends YClass {
//    private int z;
//    public XClass() {
//        super();
//        this.z = z;
//    }
//
//    @Override
//    public void one() {
//    }
//}



////2)
// class BClass {
//    private int x;
//
//    public void set(int a) {
//        this.x = a;
//    }
//
//    public void print() {
//        System.out.print(x);
//    }
//}
//
// class DClass extends BClass {
//    private int y;
//
//    public void set(int a, int b) {
//        super.set(a);
//        this.y = b; // Set y to b
//    }
//
//    @Override
//    public void print() {
//        super.print();
//        System.out.print( ", " + y); // Print y
//    }
//}


//3)
class Car {
    public  String  make;
    protected  int  weight;
    private  String  color;

    private Car(String make, int weight, String color) {
        this.make    =   make;
        this.weight  =   weight;
        this.color     =   color;
    }
    public Car( ) {
        this("unknown", -1, "white");
    }
}

class ElectricCar extends Car {
    private int rechargeHour;

    public ElectricCar() {
        this(10);
    }


    private ElectricCar(int charge) {
        super( );
        rechargeHour = charge;
    }
}


public class Hw5 {
    public static void main(String[] args) {
        Car myCar1, myCar2;
        ElectricCar  myElec1, myElec2;

        myCar1 = new Car();


        myElec1 = new ElectricCar();





    }
}
