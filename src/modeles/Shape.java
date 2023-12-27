package modeles;

public class Shape {
    private Point[] points; // Array of points defining the shape

    // Constructor to initialize a Shape with an array of Points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Method to calculate the perimeter of the shape
    public double perimeter() {
        double perimeter = 0;
        Point current, next;

        // Calculate the sum of distances between consecutive points
        for (int i = 0; i < points.length; i++) {
            current = points[i];
            next = points[(i + 1) % points.length];

            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

    // Method to find the length of the longest side in the shape
    public double longestSide() {
        double longest = 0;
        Point current, next;

        for (int i = 0; i < points.length; i++) {
            current = points[i];
            next = points[(i + 1) % points.length];

            if (longest < current.distanceTo(next)) {
                longest = current.distanceTo(next);
            }
        }

        return longest;
    }

    //Method to calculate the average length of sides in the shape
    public double averageSide() {
        return perimeter() / points.length;
    }
}