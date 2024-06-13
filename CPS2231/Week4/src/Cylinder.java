public class Cylinder {

    private  double baseRadius;

    private double height;

    public Cylinder ( ) {baseRadius = 0;  height = 0; }

    public Cylinder (double  l,  double  h ) {baseRadius = l;  height = h; }

    public void set (double  r,  double  h) {baseRadius = r;  height = h; }

    public String  toString ( ) {return  (baseRadius  +  "  "   +  height); }

    public  double  surfaceArea ( ) { return 2  *  3.14  *  baseRadius * height; }

    public  double volume  ( ) {  { return  3.14 * baseRadius * baseRadius * height; }

    }

    public static void main(String[] args) {
        Cylinder  cyl  =  new  Cylinder (1.5,  10);


        cyl.set(2.5,  10);
        System.out.println(cyl);
        System.out.println(cyl.volume( ) );
        System.out.println(cyl.surfaceArea( ) );

        System.out.println( "_________");




















    }

}