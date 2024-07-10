class Point {
    protected double x;
    protected double y;
// default
    public Point () {
        this.x = 0.00;
        this.y = 0.00;
    }
//  parameters
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
//  Set point coordinates
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
    // Check if two points are equal
    public boolean equals(Point x) {
        return  this.x == this.y;
    }
    public void makeCopy(Point c) {
        this.x = c.x;
        this.y = c.y;
    }
    // Get a copy of the point
    public Point getCopy() {
        return new Point(this.x, this.y);
    }
    public static void main(String[] args) {
        // Initialize myPoint and yourPoint
        Point myPoint = new Point(5.00, 4.00);
        Point yourPoint = new Point();
        System.out.println("Initialize myPoint = " + myPoint);
        System.out.println("Initialize yourPoint = " + yourPoint);
//      set points
        yourPoint.setPoint(5.00,45.00);
        System.out.println("youPoint = " + yourPoint);
        // 2 points are equal?
        System.out.println("Are they equal? "+ yourPoint.equals(yourPoint));
//      Change myPoint to 6.00 , 9.00
        myPoint.setPoint(6.00, 9.00);
        System.out.println("myPoint = "+ myPoint);
//      copy myPoint into yourPoint
        yourPoint.makeCopy(myPoint);
        System.out.println("yourPoint = "+ yourPoint);
    }
}



