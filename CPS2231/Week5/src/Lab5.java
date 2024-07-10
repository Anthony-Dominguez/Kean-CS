import java.util.Scanner;

class Temperature {
    private double temperature;

    //default
    public Temperature() {
        this.temperature = 0;
    }

    // overloaded
    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isEthylFreezing() {
        return temperature <= -173;
    }

    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }

    public boolean isOxygenBoiling() {
        return temperature <= -306;  //
    }

    public boolean isWaterFreezing() {
        return temperature <= 32;
    }
    public boolean isWaterBoiling() {
        return temperature >= 212;
    }

    public void display() {
        System.out.println("Temperature: " + temperature + " Fahrenheit");

        if (isEthylFreezing() ) {
            System.out.println("Ethyl freezing");
        }
        if (isEthylBoiling() ) {
            System.out.println("Ethyl boiling");
        }
        if (isOxygenFreezing() ) {
            System.out.println("Oxygen freezing");
        }
        if (isOxygenBoiling() ) {
            System.out.println("Oxygen boiling");
        }
        if (isWaterFreezing() ) {
            System.out.println("Water freezing");
        }
        if (isWaterBoiling() ) {
            System.out.println("Water boiling");
        }
        if (!isEthylFreezing() & !isEthylBoiling() & !isOxygenFreezing() & !isOxygenBoiling()& !isWaterFreezing() & !isWaterBoiling()) {
            System.out.println("At this temperature nothing is Boiling or Freezing");
        }

//        System.out.println("Is ethyl freezing: " + isEthylFreezing());
//        System.out.println("Is ethyl boiling: " + isEthylBoiling());
//        System.out.println("Is oxygen freezing: " + isOxygenFreezing());
//        System.out.println("Is oxygen boiling: " + isOxygenBoiling());
//        System.out.println("Is water freezing: " + isWaterFreezing());
//        System.out.println("Is water boiling: " + isWaterBoiling());
        System.out.println("------------------------------------");

    }
}






public class Lab5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature (Fahrenheit): ");

        double input1 = input.nextDouble();
        double input2 = input.nextDouble();
        double input3 = input.nextDouble();

        Temperature temperature1 = new Temperature(input1);
        Temperature temperature2 = new Temperature(input2);
        Temperature temperature3 = new Temperature(input3);

        temperature1.display();
        temperature2.display();
        temperature3.display();


    }
}


