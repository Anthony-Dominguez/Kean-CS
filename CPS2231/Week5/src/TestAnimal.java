//import java.util.Random;
//
//interface Animal {
//    void makeSound();
//
//    void getType();
//}
//
//
//// Cow class implementing Animal interface
// class Cow implements Animal {
//    private String type;
//
//    public Cow() {
//        this.type = "cow";
//    }
//
//    @Override
//    public String makeSound() {
//        return "moo";
//    }
//
//    // Method to get the type of animal
//    @Override
//    public String getType() {
//        return type;
//    }
//}
//
// Chicken implements Animal {
//    private String type;
//    private Random random;
//
//    // Constructor
//    public Chicken() {
//        this.type = "chicken";
//        this.random = new Random();
//    }
//    @Override
//    public String makeSound() {
//        int randomNumber = random.nextInt(2);
//
//        // 50% chance for each sound
//        if (randomNumber == 0) {
//            return "bawk!";
//        } else {
//            return "cluck!";
//        }
//    }
//    @Override
//    public String getType() {
//        return type;
//    }
//}
//
//public class TestAnimal {
//    public static void main(String[] args) {
//
//    }
//}
//
