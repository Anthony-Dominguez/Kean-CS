class Circle extends Point {
    protected double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }
    public Circle(double x, double y, double radius) {
        super(x,y);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "("+ super.x + "," + super.y + "," + radius+")";
    }

    public void setCircle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
//     circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }
//   area
    public double area(){
        return Math.PI * radius * radius;
    }
// equals
    public boolean equals(Circle other) {
        return (super.x == other.x && super.y == other.y && radius == other.radius);
    }
    public void makeCopy(Circle other) {
        super.makeCopy(other);
        this.radius = other.radius;
    }
    public static void main(String[] args) {
//      Initialize circle and youcircl
        Circle myCircle = new Circle(5.00,4.00,7.23);
        Circle yourCircle = new Circle();
        System.out.println("Initialize myCircle to " + myCircle);
        System.out.println("Initialize yourPoint to " + yourCircle);
//      setCircle
        yourCircle.setCircle(5.00 , 45.00 , 82.20);
        System.out.println("yourCircle is set to: " + yourCircle);
//      Area
        System.out.println("The area is: " + yourCircle.area());
//      circumference
        System.out.println("The circumference is: " + yourCircle.circumference());

//      equals
        System.out.println("Are these two circle equal? "+ yourCircle.equals(myCircle));
//
        myCircle.setPoint(6.50,8.75);
        myCircle.setRadius(13.00);
        System.out.println("myCircle: "+myCircle);
        yourCircle.makeCopy(myCircle);
        System.out.println("Copy myCircle into yourCirlce: " + yourCircle);
    }
}
