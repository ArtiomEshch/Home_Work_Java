package by.tms.Homework_4_Class.Point;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point userPoint) {
        return Math.sqrt((userPoint.x - x) * (userPoint.x - x) +
                (userPoint.y - y) * (userPoint.y - y));
    }
}
