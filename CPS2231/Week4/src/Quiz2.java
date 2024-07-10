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

//class InheritanceCPS2231 {
//    public static void main(String [ ] args) {
//        J   j  = new J( );
//    }
//}
//
//class H {
//    public H( ) {
//        System.out.println("Where are we");
//    }
//    public H(String  s)  {
//        System.out.println("lost forever");
//    }
//}
//
//class J extends H {
//    public J() {
//        this ("follow the maze");
//        System.out.println("mystery tunnel");
//    }
//
//    public J (String s) {
//        super ("finally here");
//        System.out.println("end of the line");
//    }
//}

 class FamilyMember {
    public String drink() {
        return "cup";
    }
    public String eat() {
        return "fork";
    }
}
 class Baby extends FamilyMember {
     private int age;

     // Default constructor
     public Baby() {
         this.age = 0;
     }
     public Baby(int age) {
         this.age = age;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     // Overridden eat method
     @Override
     public String eat() {
         if (age > 3) {
             return "it eats with its fork";
         } else {
             return "it eats with its hands";
         }
     }

     public static void main(String[] args) {
         Baby baby1 = new Baby();
         FamilyMember  famMem  =  new  Baby( );

         System.out.println("Baby1: " + baby1.eat());

         Baby baby2 = new Baby(4);
         System.out.println("Baby2: " + baby2.eat());
     }
 }





