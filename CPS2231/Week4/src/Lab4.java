class RetailItem{
    private String description;
    private int unitsOnHand;
    private double price;
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    public double getPrice(){
        return price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUnitsOnHand(int unitsOnHand){
        this.unitsOnHand = unitsOnHand;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
public class Lab4 {
    public static void main(String[] args) {
        RetailItem[] retailItems = new RetailItem[3];

       retailItems[0] = new RetailItem("Jacket", 12, 59.95);
       retailItems[1] = new RetailItem("Designer Jeans", 40, 34.95);
       retailItems[2] = new RetailItem("Shirt", 20, 24.95);

        String d = "Description", u = "Units on Hand", p = "Price";
        System.out.printf("                      %-20s %-20s %s\n" , d , u, p);

        System.out.println("_____________________________________________________________________");
       for (int i = 0; i < retailItems.length; i++){
           System.out.printf("Item #%-15d %-25s %-15d %.2f%n",
                   (i + 1),
                   retailItems[i].getDescription(),
                   retailItems[i].getUnitsOnHand(),
                   retailItems[i].getPrice());
       }
    }
}
