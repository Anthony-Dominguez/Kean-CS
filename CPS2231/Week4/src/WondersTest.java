import java.util.Arrays;
import java.util.Comparator;

abstract class WondersOFTheWorld{
    protected String name;
    protected String Country;

    public WondersOFTheWorld(String name, String Country){
        this.name = name;
        this.Country = Country;
    }

    public abstract void visit();

    public String getCountry(){
        return Country;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Name: "+ name + ", Country:  " + Country;
    }
}
interface Visitable{
    void visit();
    void takePhoto();
}


class HistoricWonder extends WondersOFTheWorld implements Visitable{

    public HistoricWonder(String name, String Country){
        super(name, Country);
    }
    public void visit(){
        System.out.println("Visting a Historic Wonder" + name);
    }
    public void takePhoto(){
        System.out.println("Taking a Historic Wonder photo"+ name);
    }
}

class NaturalWonder extends WondersOFTheWorld implements Visitable{
    public NaturalWonder(String name, String Country){
        super(name, Country);
    }

    public void visit(){
        System.out.println("Visting a Natural Wonder Wonder" + name);
    }
    public void takePhoto(){
        System.out.println("Taking a Natural Wonder photo"+ name);
    }
}
public class WondersTest{


    public static void main(String[] args) {

        WondersOFTheWorld[] wonders = new WondersOFTheWorld[3];
        wonders[0] = new HistoricWonder("Great Wall of Chine", "China");
        wonders[1] = new NaturalWonder("Amazon Rain Forest", "South America");
        wonders[2] = new HistoricWonder("Machu Picchu", "Peru");

        System.out.println("\nBefore sorting: ");
        for(WondersOFTheWorld wonder : wonders){
            System.out.println(wonder);
        }

        System.out.println("\nSorting wonders by country");
        Arrays.sort(wonders, Comparator.comparing(WondersOFTheWorld::getCountry));
        for(WondersOFTheWorld wonder : wonders){
            System.out.println(wonder);
        }

    }
}
