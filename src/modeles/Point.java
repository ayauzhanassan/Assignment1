package modeles;

// A class representing a point in a two-dimensional space
public class Point {
    private double x; // x-coordinate
    private double y; // y-coordinate

    // Constructor to initialize a Point with specified x and y coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the distance between this Point and another Point
    public double distanceTo(Point other) {
        double deltaX, deltaY, sum;

        // Calculate the differences in x and y coordinates
        deltaX = this.x - other.x;
        deltaY = this.y - other.y;
        // Calculate the squared sum of differences
        sum = (deltaX * deltaX) + (deltaY * deltaY);

        return Math.sqrt(sum);
    }

    // Method to represent a Point as a string
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}