package modeles;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        double deltaX, deltaY, sum;

        deltaX = this.x - other.x;
        deltaY = this.y - other.y;
        sum = (deltaX * deltaX) + (deltaY * deltaY);

        return Math.sqrt(sum);
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}