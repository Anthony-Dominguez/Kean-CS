public class CartSuitsEnum {
    enum CartSuit{
        CLUBS("Clubs"),
        HEART("Hearts"),
        SPADES("Spades"),
        DIAMONDS("Diamonds");

        private final String suitName;

        CartSuit(String suitName) {
            this.suitName = suitName;
        }
        public String getSuitName(){
            return suitName;
        }
    }

    //Enum for Cart Values

//    enum CardVal {
//        TWO("two",2)
//        THREE("Three",3);
//        FOUR("Four",4);
//        FIVE("Five",5);
//        SIX("Six",6);
//        SEVEN("Seven",7);
//        EIGHT("Eight",):
//        NINE;
//        TEN;
//        JACK;
//        QUEEN;
//        KING;
//        ACE;
//
//    }



    public static void main(String[] args) {



    }
}
