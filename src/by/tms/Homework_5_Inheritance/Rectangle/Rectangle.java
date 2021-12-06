package by.tms.Homework_5_Inheritance.Rectangle;

import by.tms.Homework_5_Inheritance.Figure;

public class Rectangle extends Figure implements GetRectangleValue {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return height * 2 + width * 2;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt((height * height) + (width * width));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.height, height) != 0) return false;
        return Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
