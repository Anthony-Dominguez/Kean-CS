import java.util.Comparator;
import java.util.Arrays;


abstract class RetirementActivities{
    protected String name;
    protected String location;


    public static int numActivities;
    public static String[] name;


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


class Crusing extends RetirementActivities{
    i
}
