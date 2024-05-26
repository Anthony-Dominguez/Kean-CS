public class LoopExamplesNoObject {
    public static void main(String[] args) {
//        System.out.println("USing a while loop");
//        whileloopexample();
//
//        forloopexample();
//
//
        doloopexample();

//    }public static void whileloopexample() {
//        int i = 1;
//        while (i<=5) {
//            System.out.println(i);
//            i++;
//        }
//
//
//    }public static void forloopexample() {
//        for (int i = 2; i <= 10 ; i+=2) {
//            System.out.println(i);
//        }

    }public static void doloopexample() {
        int userInput;
        boolean valid_Input= false;
        do{
            System.out.print("Enter a number: ");
            userInput = getUserinput();
            if (userInput >= 1 && userInput <= 100) {
                System.out.print("Valid input");
                valid_Input = true;
            }else {
                System.out.print("Invalid input");
            }
        }while (!valid_Input);
    }
    private static int getUserinput() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int userInput;
        userInput = input.nextInt();
        return userInput;

    }
}
