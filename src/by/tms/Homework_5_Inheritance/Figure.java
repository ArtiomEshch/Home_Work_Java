package by.tms.Homework_5_Inheritance;

import by.tms.Homework_5_Inheritance.Point.Point;

public abstract class Figure {
    public Point x, y;

    public Figure() {
    }

    public Figure(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Figure{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
