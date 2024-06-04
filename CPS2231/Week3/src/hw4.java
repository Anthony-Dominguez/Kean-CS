 class MyClass {
    private int x;
    private static int count;


    public MyClass() {
        this.x = 0;
        count++;
    }
    public MyClass(int a) {
        this.x = a;
        count++;
    }
    public void setX(int a){
        this.x = a;
    }
    public void printX() {
        System.out.println("x: "+ x);
    }
    public static void printCount() {
        System.out.println("count: "+ count);
    }
    public static void incrementCount() {
        count++;
    }
}


public class hw4 {
    public static void main(String[] args) {
        MyClass myObject2 = new MyClass(7);
        MyClass myObject1 = new MyClass(5);

        myObject1.printX( );
        myObject1.incrementCount( );
        MyClass.incrementCount( );
        myObject1.printCount( );
        myObject2.printCount( );
        myObject2.printX( );
        myObject1.setX(14);
        myObject1.incrementCount( );
        myObject1.printX( );
        myObject1.printCount( );
        myObject2.printCount( );

    }
}
