

package saj2;
// Abstract base class representing a generic shape
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Concrete class representing a circle, extends Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override to calculate the area of the circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Override to calculate the perimeter (circumference) of the circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class representing a triangle, extends Shape
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor to initialize the sides of the triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Override to calculate the area of the triangle using Heron's formula
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override to calculate the perimeter of the triangle
    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Demo class to test the Shape hierarchy
public class ShapeAreaPeri {
    public static void main(String[] args) {
        // Create a circle with radius 5
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Create a triangle with sides 3, 4, and 5
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
