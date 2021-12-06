package by.tms.Homework_5_Inheritance;

import by.tms.Homework_5_Inheritance.Circle.Circle;
import by.tms.Homework_5_Inheritance.Rectangle.Rectangle;

public class Test {
    public static void main(String[] args) {

        Figure rectangle = new Rectangle();

        Figure circle = new Circle();

        System.out.println(ShapeUtils.isRectungle(rectangle));
        System.out.println(ShapeUtils.isTriangle(circle));
    }
}
