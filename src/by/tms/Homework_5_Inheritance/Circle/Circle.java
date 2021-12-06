package by.tms.Homework_5_Inheritance.Circle;

import by.tms.Homework_5_Inheritance.Figure;
import by.tms.Homework_5_Inheritance.Point.Point;

public class Circle extends Figure implements GetCircleValue {

    Point center, edge;

    Radius radius;

    public Circle(Point center, Point edge) {
        this.center = center;
        this.edge = edge;
    }

    public Circle() {
    }

    class Radius {
        double lenght = Point.getDistance(center, edge);
    }

    @Override
    public double getDiameter() {
        return radius.lenght * 2;
    }

    @Override
    public double getArea() {
        return p * (radius.lenght * radius.lenght);
    }

    @Override
    public double getPerimeter() {
        return 2 * p * radius.lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (center != null ? !center.equals(circle.center) : circle.center != null) return false;
        if (edge != null ? !edge.equals(circle.edge) : circle.edge != null) return false;
        return radius != null ? radius.equals(circle.radius) : circle.radius == null;
    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + (edge != null ? edge.hashCode() : 0);
        result = 31 * result + (radius != null ? radius.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", edge=" + edge +
                ", radius=" + radius +
                '}';
    }
}
