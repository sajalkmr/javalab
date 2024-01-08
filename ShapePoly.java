
package sajal;
class Shape {
    // Method to draw a shape
    public void draw() {
        System.out.println("Drawing a shape");
    }

    // Method to erase a shape
    public void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    // Override draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Override erase method for Circle
    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }
}

class Triangle extends Shape {
    // Override draw method for Triangle
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    // Override erase method for Triangle
    @Override
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}

class Square extends Shape {
    // Override draw method for Square
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    // Override erase method for Square
    @Override
    public void erase() {
        System.out.println("Erasing a square");
    }
}

public class ShapePoly {
    public static void main(String[] args) {
        // Creating an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        // Loop through the array and call draw and erase methods for each shape
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}
