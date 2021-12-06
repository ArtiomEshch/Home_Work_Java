package by.tms.Homework_4_Class.Rectangle;

import by.tms.Homework_4_Class.Point.Point;

public class Rectangle {
    static Point upperLeftCorner;
    static Point lowerRightCorner;

    public Rectangle(Point upperLeftCorner, Point lowerRightCorner) {
        this.lowerRightCorner = lowerRightCorner;
        this.upperLeftCorner = upperLeftCorner;

    }

    public static void area(Rectangle rectangleToProcess) {
        double area = (upperLeftCorner.y - lowerRightCorner.y) * (lowerRightCorner.x - upperLeftCorner.x);
        System.out.println(area);
    }

    public static void perimeter(Rectangle rectangleToProcess) {
        double perimeter = 2 * ((upperLeftCorner.y - lowerRightCorner.y) + (lowerRightCorner.x - upperLeftCorner.x));
        System.out.println(perimeter);
    }

    public static void diagonal(Rectangle rectangleToProcess) {
        double diagonal = Math.sqrt((upperLeftCorner.y - lowerRightCorner.y) * (upperLeftCorner.y - lowerRightCorner.y) +
                (lowerRightCorner.x - upperLeftCorner.x) * (lowerRightCorner.x - upperLeftCorner.x));
        System.out.println(diagonal);
    }
}
