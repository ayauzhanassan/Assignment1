import modeles.Point;
import modeles.Shape;

import java.io.*;
import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<>();
        String line;
        File fileName = new File("/Users/ayauzhanassan/IdeaProjects/Assignment1/src/source.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                double x = Double.parseDouble(parts[0].trim());
                double y = Double.parseDouble(parts[1].trim());
                pointList.add(new Point(x, y));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        }

        Point[] points = new Point[pointList.size()];
        points = pointList.toArray(points);

        Shape shape = new Shape(points);
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest side: " + shape.longestSide());
        System.out.println("Average side length: " + shape.averageSide());
    }
}