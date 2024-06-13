import java.util.Arrays;

abstract class Factory{
    protected String name;
    protected int capacity;

    protected static final String CATEGORY = "Factory";
    protected static int totalFactories = 0;

    public Factory() {
        this.name = name;
        this.capacity = 0;
        totalFactories++;
    }
    public Factory(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        totalFactories++;

    }
    public abstract void produce();
    public abstract void maintain();

    public String toString(){
        return "Name: "+ name + ", Capacity: " + capacity;
    }
    public String getName() {
        return name;
    }
    public static void printCategory(){
        System.out.println("Category: " + CATEGORY);
    }
//    public int getCapacity() {
//        return capacity;
//    }
}


interface FactoryPolicy {
    static void printPolicy(){
        System.out.println("This is a factory policy ");
    }

    void implementPolicy();

    default void applyPolicy(){
        System.out.println("Applying factory policy");
    }
}
class FactoryObject{
    private String name;
    public FactoryObject(String name){
        this.name = name;
    }
    public String toString() {
        return "Factory Object: " + name;
    }
}

class AutomobileFactory extends Factory implements FactoryPolicy{
    private String location;
    private FactoryObject[] factoryObject;

    public AutomobileFactory(String name,int capacity, String location,  FactoryObject[] factoryObjects) {
        super(name , capacity);
        this.location = location;
        this.factoryObject = factoryObjects;
    }

    public FactoryObject [] getFactoryObject(){
        return factoryObject;
    }
    //Override

    public void produce(){
        System.out.println("Produce automobile in factory");
    }
    public void maintain(){
        System.out.println("Maintain automobile in factory");
    }

    public void implementPolicy(){
        System.out.println("Implementing automobile policy");
    }
    public String toString(){
        return super.toString() + ", Location: "+ location;
    }

}



public class FactoryTest {
    public static void main(String[] args) {


        FactoryObject assemblyLine = new FactoryObject("AssemblyLine");
        FactoryObject paintShop = new FactoryObject("Paint Shop");
        FactoryObject testingLab = new FactoryObject("Testing Shop");
        FactoryObject packingUnit = new FactoryObject("Packing Unit");
        FactoryObject mixingStation = new FactoryObject("Mixing Station");

        FactoryObject[] automobileComponets = new FactoryObject[]{assemblyLine,paintShop};
        FactoryObject[] ElectronicComponets = new FactoryObject[]{testingLab,packingUnit};
        FactoryObject[] foodComponents = new FactoryObject[]{mixingStation,assemblyLine};

        Factory automobileFactory = new AutomobileFactory("Automobile", 1000, "Detriot", automobileComponets);


        automobileFactory.produce();
        automobileFactory.maintain();

        System.out.println(Arrays.toString(((AutomobileFactory)automobileFactory).getFactoryObject()));

        System.out.println();


        automobileFactory.printCategory();
        ((FactoryPolicy)automobileFactory).implementPolicy();
        FactoryPolicy.printPolicy();

    }
}
