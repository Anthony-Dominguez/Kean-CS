abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    // Abstract methods
    public abstract double area();
    public abstract double perimeter();

    public String toString() {
        return name + ", Area: " + area() + ", Perimeter: " + perimeter();
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    private double a;
    private double c;

    public Triangle(String name, double base, double height , double a, double c)   {
        super(name);
        this.base = base;
        this.height = height;
        this.a = a;
        this.c = c;
    }
    @Override
    public double area() {
        return 0.5 * base * height;
    }
    @Override
    public double perimeter() {
        return a+base+c;
    }
}
class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI * Math.pow(radius, 2) ;
    }
    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
class Polygon extends Shape {
    private int sides;
    private double base;
    private double apothem;

    public Polygon(String name, int sides, double base, double apothem ) {
        super(name);
        this.sides = sides;
        this.base = base;
        this.apothem = apothem;
    }
    @Override
    public double area() {
        return 0.5 * sides * base * apothem;
    }
    @Override
    public double perimeter() {
        return sides * base;
    }
}
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("Rectangle", 3 ,8 );
        Shape shape2 = new Triangle("Triangle", 12 ,25, 12 ,4);
        Shape shape3 = new Circle("Circle",24);
        Shape shape4 = new Polygon("Polygon",7, 12, 20);
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
    }
}







