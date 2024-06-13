import java.util.Comparator;
import java.util.Arrays;


abstract class RetirementActivities{
    protected String name;
    protected String location;


    public static int numActivities;
    public static String[] arrayActivities;


    public RetirementActivities(String name, String location){
        this.name = name;
        this.location = location;
        numActivities++;
    }

    public abstract void enjoy();

    public static void sortActivities(RetirementActivities[] activities) {
        Arrays.sort(activities, Comparator.comparing(RetirementActivities::getName));
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public String toString(){
        return "Name: " + name + " Location: " + location;
    }
}


class Cruising extends RetirementActivities implements Relaxation,OutdoorActivity{
    public Cruising(String name, String location){
        super(name, location);
    }

//    Override
    public void enjoy(){
        System.out.println("Enjoying a cruise activity " + name);
    }
//   Override
    public void getMassage(){
        System.out.println("Getting a message during a cruise activity " + name);
    }
//   Override

    public void doOutdoorActivity(){
        System.out.println("Doing outdoor activity during the cruising activity " + name);
    }
}


class Camping extends RetirementActivities implements Relaxation,OutdoorActivity{
    public Camping(String name, String location){
        super(name, location);
    }

    //    Override
    public void enjoy(){
        System.out.println("Enjoying a camping activity " + name);
    }
    //   Override
    public void getMassage(){
        System.out.println("Getting a message during a camping activity " + name);
    }
//   Override
    public void doOutdoorActivity(){
        System.out.println("Doing outdoor activity during the camping activity " + name);
    }
}

interface Relaxation{
    void getMassage();

}
interface OutdoorActivity{
    void doOutdoorActivity();
}


public class RetirementTest{
    public static void main(String[] args) {
        RetirementActivities[] activities = new RetirementActivities[4];
        activities[0] = new Cruising("Lux Cruise", "Carribean");
        activities[1] = new Camping("Forest", "Nation Park");
        activities[2] = new Cruising("River Cruise", "Europe");
        activities[3] = new Cruising("Mountain Expedition", "Rocky Mountain");

        System.out.println("Before Sorting: ");
        for (RetirementActivities activity : activities){
            System.out.println(activity);
        }

        System.out.println("\nAfter Sorting: ");

        RetirementActivities.sortActivities(activities);
        Arrays.sort(activities, Comparator.comparing(RetirementActivities::getName));
        for (RetirementActivities activity : activities){
            System.out.println(activity);
        }

    }
}
