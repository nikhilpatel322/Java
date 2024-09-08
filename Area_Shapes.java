class Cube {
    private double side;
    public Cube(double side) {
        this.side = side;
    }
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }
}
class Sphere {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    public double calculateSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
public class Area_Shapes {
    public static void main(String[] args) {
        Cube myCube = new Cube(5.0);
        Sphere mySphere = new Sphere(3.0);
        Cylinder myCylinder = new Cylinder(4.0, 6.0);

        double cubeArea = myCube.calculateSurfaceArea();
        double sphereArea = mySphere.calculateSurfaceArea();
        double cylinderArea = myCylinder.calculateSurfaceArea();

        System.out.println("Surface area of the cube: " + cubeArea);
        System.out.println("Surface area of the sphere: " + sphereArea);
        System.out.println("Surface area of the cylinder: " + cylinderArea);
    }
}
