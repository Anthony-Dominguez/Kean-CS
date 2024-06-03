 class Farm {
    private String name;
    private static int totalFarms = 0;
    private static Farm[] farmArray = new Farm[2];
    public Farm() {
        this.name = name;
        totalFarms++;
    }
        public Farm(String name) {
        this.name = name;
        totalFarms++;
    }
    public Farm(Farm other){
        this.name = other.name;
        totalFarms++;
    }
    public static int getTotalFarms() {
        return totalFarms;
    }
    public static Farm[] getFarmArray() { // to get form array
        return farmArray;
    }
    public static void setFarmArray(Farm[] farmArray) {
        Farm.farmArray = farmArray; // prefix since is static
    }
    public String toString() {
        return "Farm: " + name + ", Total Farms: " + totalFarms;
    }
}
class AnimalFarm extends Farm {
   private int numberOfAnimals;
   //Overloading
   public AnimalFarm(String name , int numberOfAnimals) {
       super(name);
       this.numberOfAnimals = numberOfAnimals;
   }
   public int getNumberOfAnimals() {
       return numberOfAnimals;
   }
   public void setNumberOfAnimals(int numberOfAnimals) {
       this.numberOfAnimals = numberOfAnimals;
   }
   public String toString() { // Overloading
       return "Animal Farm : " + super.toString() + ", Number of Animals: " + numberOfAnimals;
   }
   public double calculateFoodRequirement(double foodPerAnimal){
       return numberOfAnimals*foodPerAnimal;
   }
}
 class ChickenFarm extends AnimalFarm {
     private int numberOfChickens;
     //Overloading
     public ChickenFarm(String name ,int numberOfAnimals ,  int numberOfChickens) {
         super(name,numberOfAnimals);
         this.numberOfChickens = numberOfChickens;
     }
     public int getNumberOfChickens() {
         return numberOfChickens;
     }
     public void setNumberOfChickens(int numberOfChickens) {
         this.numberOfChickens = numberOfChickens;
     }
     public String toString() { // Overloading
         return "Chicken Farm : " + super.toString() + ", Number of Chicken: " + numberOfChickens;
     }
     public double calculateEggProductionRate(){
         return numberOfChickens*0.8;
     }
 }

 public class FarmTest {
    public static void main(String[] args) {
        Farm[] farmArray = new Farm[2];
        farmArray[0] = new AnimalFarm("Meadow Farm", 50);
        farmArray[1] = new ChickenFarm("Sunrise Farm", 100, 200);


        for(Farm farm: farmArray){
            System.out.println(farm.toString());
        }


        AnimalFarm animalFarm = (AnimalFarm) farmArray[0]; // it doeesn't remember.


        double foodPerAnimal = 2.5;
        double foodRequirement = animalFarm.calculateFoodRequirement(foodPerAnimal);


        System.out.println("Food requirement: " + foodRequirement+ "kg/d") ;

        ChickenFarm chickenFarm = (ChickenFarm) farmArray[1];
        double eggProductionRate = chickenFarm.calculateEggProductionRate() ;
        System.out.println("Egg requirement: "+eggProductionRate+"kg/d");


    }
 }


