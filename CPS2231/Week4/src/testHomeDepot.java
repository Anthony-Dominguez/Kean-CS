interface HomeDepotPolicy{
    static void printPolicy(){
        System.out.println("This is a Home Depot policy ");
    }
    void implementPolicy();

    default void applyPolicy(){
        System.out.println("Applying home depot policy");
    }
}

abstract class HomeDepot{
    private static int totalStores = 0;
    private static final String COMPANY_NAME = "Home Depot ";

    public static int getTotalStores(){
        return totalStores;
    }

    public static String getCompanyName(){
        return COMPANY_NAME;
    }
    public HomeDepot(){
        totalStores++;
    }
    public abstract void provideService();
}

class StoreA extends HomeDepot implements HomeDepotPolicy {
    private String location;

    public StoreA(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


//    override

    public void provideService(){
        System.out.println("Providing a service for Store A");
    }

    public void implementPolicy(){
        System.out.println("Implementing a service for Store A");
    }
}

class StoreB extends HomeDepot implements HomeDepotPolicy {
    private String location;

    public StoreB(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


//    override

    public void provideService(){
        System.out.println("Providing a service for Store B");
    }

    public void implementPolicy(){
        System.out.println("Implementing a service for Store B");
    }
}



public class testHomeDepot {
    public static void main(String[] args) {

        System.out.println("Company Name: " + HomeDepot.getCompanyName());
        System.out.println("Total Stores: " + HomeDepot.getTotalStores());

       StoreA storeA = new StoreA("New York");
       StoreB storeB = new StoreB("Los Angeles");


        System.out.println("Total Stores: " + HomeDepot.getTotalStores());

        System.out.println("Store A location: " + storeA.getLocation());
        System.out.println("Store B location: " + storeB.getLocation());



    HomeDepotPolicy.printPolicy();
    storeA.implementPolicy();
    storeB.implementPolicy();

    storeA.provideService();
    storeB.provideService();




    }
}