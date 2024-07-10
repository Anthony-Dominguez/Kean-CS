public class TestSpring2024 {
public static void main(String [] args) {


    System.out.println(myFunction(4, 8));

    System.out.println(testFinal(10,20));
  }

  
  public static int myFunction(int x, int y) {
       if (x == y)
               return x;
       else if (x > y)
              return myFunction(x - 1, y) + 2;
       else
             return myFunction(x + 1, y) - 2;
     }

    public static int testFinal(int x, int y) {
        if (x < y) return -5;
        else return (testFinal(x - y, y + 5) + 6);
    }
 }
