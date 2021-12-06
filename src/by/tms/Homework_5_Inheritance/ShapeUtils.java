package by.tms.Homework_5_Inheritance;

import by.tms.Homework_5_Inheritance.Rectangle.Rectangle;
import by.tms.Homework_5_Inheritance.Treangle.Triangle;

public class ShapeUtils {
    public static boolean isRectungle(Figure figureToProcess) {
        return figureToProcess instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figureToProcess) {
        return figureToProcess instanceof Triangle;
    }
}
