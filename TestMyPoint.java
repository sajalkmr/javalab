
package sajal;

class MyPoint {
    // Private fields representing x and y coordinates
    private int x;
    private int y;

    // Default constructor initializing the point at the origin (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor allowing to specify coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set new coordinates
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the current coordinates as an array
    public int[] getXY() {
        int[] coordinates = {x, y};
        return coordinates;
    }

    // Method to calculate the distance between this point and a specified point
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate the distance between this point and another MyPoint object
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate the distance between this point and the origin
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Override toString method for a human-readable representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


public class TestMyPoint {
    public static void main(String[] args) {
        // Creating instances of MyPoint
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(3, 4);

        // Displaying points
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Setting new coordinates for point1
        point1.setXY(1, 2);
        System.out.println("Point 1 after setXY: " + point1);

        // Getting coordinates of point2
        int[] point2XY = point2.getXY();
        System.out.println("Coordinates of Point 2: (" + point2XY[0] + ", " + point2XY[1] + ")");

        // Calculating distance of point1 to the origin
        double distanceToOrigin = point1.distance();
        System.out.println("Distance of Point 1 to origin: " + distanceToOrigin);

        // Calculating distance between point1 and point2
        double distanceBetweenPoints = point1.distance(point2);
        System.out.println("Distance between Point 1 and Point 2: " + distanceBetweenPoints);
    }
}
