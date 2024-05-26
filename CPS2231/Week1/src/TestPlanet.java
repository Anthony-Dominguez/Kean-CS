class Planet {
    private static int planetCount;
    private static final double GRAVITY_CONSTANT = 9.8;

    private String name;
    private double mass;
    private double radius;

    public Planet() {
        this("Unknown", 0.0, 0.0); // Calls the overloaded constructor
    }

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        planetCount++;
    }

    public Planet(Planet other) {
        this.name = other.name;
        this.mass = other.mass;
        this.radius = other.radius;
        planetCount++;
    }

    public static int getPlanetCount() {
        return planetCount;
    }

    public static double getGravityConstant() {
        return GRAVITY_CONSTANT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class TestPlanet {
    public static void main(String[] args) {
        Planet[] planets = new Planet[3];

        planets[0] = new Planet();
        planets[1] = new Planet("Mars", 0.1234, 32452.5);
        planets[2] = new Planet(planets[1]); // Use planets[1] to create a copy

        System.out.println("Planet count: " + Planet.getPlanetCount());

        for (Planet planet : planets) {
            System.out.println("Name: " + planet.getName() + ", Mass: " + planet.getMass() + ", Radius: " + planet.getRadius());
        }

        System.out.println("Gravity constant: " + Planet.getGravityConstant());
    }
}
