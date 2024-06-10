interface Eatable{
    void eat();
    void unwrap();
}

abstract class Candy{
    private static int totalCandies = 0;
    private static final String BRAND_NAME = "CandyCo";


    public static int getTotalCandies(){
        return totalCandies;
    }
    public static String getBrandName(){
        return BRAND_NAME;
    }
    public Candy(){
        totalCandies++;
    }

    public abstract void unwrap();
}

class ChocolateCandy extends Candy implements Eatable{
    private String flavor;
    public ChocolateCandy(String flavor){
        super();
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }
//    Override
    public void unwrap(){
        System.out.println("You unwrap the chocolate candy");
    }

    public void eat(){
        System.out.println("You eat the chocolate candy with flavor " + flavor);
    }

}
class
FruitCandy extends Candy implements Eatable{
    private String fruitType;
    public FruitCandy(String fruitType){
        super();
        this.fruitType = fruitType;
    }
    public String getFruitType(){
        return fruitType;
    }
    //    Override
    public void unwrap(){
        System.out.println("You unwrap the fruit candy");
    }

    public void eat(){
        System.out.println("You eat the fruit candy with type " + fruitType);
    }
}

public class CandyTest {
    public static void main(String[] args) {
        System.out.println("Brand Name : " + Candy.getBrandName());
        System.out.println("Total Candies : " + Candy.getTotalCandies());


        Eatable chocolateCandy = new ChocolateCandy("Milk"); // super == sub
        Eatable fruitCandy = new FruitCandy("Apple"); // super == sub

        System.out.println("Total Candies : " + Candy.getTotalCandies());

        chocolateCandy.eat();
        fruitCandy.eat();

       chocolateCandy.unwrap();





    }
}
