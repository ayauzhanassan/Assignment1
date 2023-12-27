package modeles;

public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        Point current, next;

        for (int i = 0; i < points.length; i++) {
            current = points[i];
            next = points[(i + 1) % points.length];

            perimeter += current.distanceTo(next);
        }

        return perimeter;
    }

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

    public double averageSide() {
        return perimeter() / points.length;
    }
}