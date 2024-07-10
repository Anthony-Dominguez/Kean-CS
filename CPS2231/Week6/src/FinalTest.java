interface Valuable {
   default void marketValue(){
     System.out.println("Market Value: is 0");
   };
}

abstract class Investment implements Valuable {
  protected String itemName;
  protected double value;
// constructor
  public Investment(String itemName, double value) {
    this.itemName = itemName;
    this.value = value;
  }
  public String toString() {
    return "Investment [itemName=" + itemName + ", value=" + value + "]";
}
public abstract String recommendedStorage();

}

class Jewelry extends Investment {
  private String material;
  private double carat;

  public Jewelry (String itemName, double value, String material, double carat) {
    super(itemName, value);
    this.material = material;
    this.carat = carat;
  }
  public String getMaterial() {
    return material;
  }
  public String getPlaceOfPurchase(){
    return "Cold Stone jewelry store";
  }
  // override
  public String toString() {
    return "item: "+ itemName +", value: "+ value +", material: "+ material +", PlaceOfPurchase: "+ getPlaceOfPurchase();
}

  public String recommendedStorage() {
    return " Jewelry box";
  }
  public void marketValue() {
    double pricePerCarat = 0.0;
    switch (material.toLowerCase()) {
      case "gold":
          pricePerCarat = 100.0;
          break;
      case "silver":
          pricePerCarat = 30.0;
          break;
      case "platinum":
          pricePerCarat = 200.0;
          break;
      default:
          System.out.println("Unknown material");
          return;
  }
  double marketValue = pricePerCarat * carat; // market value of the jewelry
  System.out.println("The market value of the jewelry is: " + marketValue);
  }
}


class Security extends Investment {
  private String symbol;
  private String exchange;

  public Security(String itemName, double value, String symbol, String exchange) {
    super(itemName, value);
    this.symbol = symbol;
    this.exchange = exchange;
  }

  public String getSymbol() {
    return symbol;
  }

  public String getExchange(){
    return exchange;
  }

  // override
  public String toString(){
    return "item: "+ itemName +", value: "+ value +", Symbol: "+ symbol +", exchange: "+ exchange;
  }

  public String recommendedStorage() {
    return "Brokerage account";
  }
  public void marketValue() {
    System.out.println("Market value is based on the average price.");
  }
}


public class FinalTest {
  public static void main(String[] args) {
      // Create two Valuable objects
      Jewelry goldRing = new Jewelry("Ring", 2000.0, "Gold", 1);
      Security googleStock = new Security("Stock", 430.0, "GOOGL", "NASDAQ");


      Valuable[] investments = {goldRing, googleStock};

      for (Valuable valuable : investments) {
        System.out.println(valuable);
        valuable.marketValue();
        System.out.println("Store at "+ ((Investment)valuable).recommendedStorage());
        System.out.println();
      }

     
  }
}







