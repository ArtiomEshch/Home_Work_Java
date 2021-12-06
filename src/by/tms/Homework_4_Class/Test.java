package by.tms.Homework_4_Class;

import by.tms.Homework_4_Class.Point.Point;
import by.tms.Homework_4_Class.Rectangle.Rectangle;

public class Test {
    public static void main(String[] args) {

        Point firstPoint = new Point(1, 1);
        Point userPoint = new Point(5, 5);
        System.out.println(firstPoint.distance(userPoint));

        Rectangle testRectangle = new Rectangle(new Point(1, 3), new Point(5, 1));

        Rectangle.area(testRectangle);
        Rectangle.perimeter(testRectangle);
        Rectangle.diagonal(testRectangle);
    }
}
