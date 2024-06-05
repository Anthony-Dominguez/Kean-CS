class SnackFood{
    protected String name;
    protected double price;
    protected static int totalSnacks;
    protected static SnackFood[] SnackArray;



    public SnackFood(){
        this.name  =" Unknown";
        this.price =0;
        totalSnacks++;
    }
    public SnackFood(String name, double price){
        this.name = name;
        this.price = price;
        totalSnacks++;
    }
    public SnackFood(SnackFood other) {
        this.name = other.name;
        this.price = other.price;
        totalSnacks++;
    }
    public static int getTotalSnacks(){
        return totalSnacks;
    }
    public static SnackFood[] getSnackArray(){
        return SnackArray;
    }
    public static void setSnackArray(SnackFood[] SnackArray){
        SnackFood.SnackArray = SnackArray;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void displaySnackInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    public void comsume(){
        System.out.println("Enjoy snackfood! ");
    }
}

class Chips extends SnackFood{
    private String flavor;

    public Chips(){
        super();
        this.flavor = "Chips";
    }
    public Chips(String name, double price, String flavor){
        super(name, price);
        this.flavor = flavor;
    }
    public  Chips(Chips other){
        super(other);
        this.flavor = other.flavor;
    }
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public void displaySnackInfo(){
        super.displaySnackInfo();
        System.out.println("Flavor: " + flavor);
    }
    public void comsume(){
        System.out.println("Enjoy snack! ");
    }
}
class Candy extends SnackFood{
    private String type;

    public Candy(){
        super();
        this.type = "Cookie";
    }
    public Candy(String name, double price, String type){
        super(name, price);
        this.type = type;
    }
    public Candy(Candy other){
        super(other);
        this.type = other.type;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public void displaySnackInfo(){
        super.displaySnackInfo();
        System.out.println("Type: " + type);
    }
    public void comsume(){
        System.out.println("Enjoy Candy! ");
    }
}





public class SnackFoodTest {
    public static void main(String[] args) {
        SnackFood[] snacks = new SnackFood[3];
        snacks[0] = new Chips("Chips", 100.00, "PopCorn");
        snacks[1] = new Candy("Candy 1", 50.00, "Cookie");
        snacks[2] = new Candy("Candy 2", 200.00, "Hersey");


        for(SnackFood snack : snacks){
            snack.displaySnackInfo();
            snack.comsume();
            System.out.println("----------------------");
        }

        System.out.println("Total parks "+ SnackFood.getTotalSnacks());




    }
}
