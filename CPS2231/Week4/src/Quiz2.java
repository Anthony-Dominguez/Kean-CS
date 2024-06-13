// class Walmart extends RetailBusiness
//{
//    public static void main(String [ ] args)
//    {  new Walmart( );  }
//
//    public Walmart( )
//    { System.out.println("shop girl shop");}
//}
//
//class RetailBusiness extends Business
//{
//    public RetailBusiness( )
//    {
//        this ("sales booming");
//        System.out.println("coupons flowing");
//    }
//
//    public RetailBusiness (String str)
//    { System.out.println(str); }
//}
//
//class Business {
//    public Business( ) { System.out.println("stock going up");}
//}

class InheritanceCPS2231 {
    public static void main(String [ ] args) {
        J   j  = new J( );
    }
}

class H {
    public H( ) {
        System.out.println("Where are we");
    }
    public H(String  s)  {
        System.out.println("lost forever");
    }
}

class J extends H {
    public J() {
        this ("follow the maze");
        System.out.println("mystery tunnel");
    }

    public J (String s) {
        super ("finally here");
        System.out.println("end of the line");
    }
}


