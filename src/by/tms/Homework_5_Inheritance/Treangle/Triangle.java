package by.tms.Homework_5_Inheritance.Treangle;

import by.tms.Homework_5_Inheritance.Figure;

public class Triangle extends Figure implements GetTriangleValue {
    double sideA;
    double sideB;
    double treangleBase;
    Semiperimeter p;

    public Triangle(double sideA, double sideB, double treangleBase) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.treangleBase = treangleBase;
    }

    public Triangle() {
    }

    class Semiperimeter {
        double value() {
            return (sideA + sideB + treangleBase) % 2 + (sideA + sideB + treangleBase) / 2;
        }
    }

    @Override
    public double getArea() {
        return Math.sqrt((p.value() - sideA) * (p.value() - sideB) * (p.value() - treangleBase));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + treangleBase;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideA, sideA) != 0) return false;
        if (Double.compare(triangle.sideB, sideB) != 0) return false;
        if (Double.compare(triangle.treangleBase, treangleBase) != 0) return false;
        return p != null ? p.equals(triangle.p) : triangle.p == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(treangleBase);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (p != null ? p.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", treangleBase=" + treangleBase +
                ", p=" + p +
                '}';
    }
}
