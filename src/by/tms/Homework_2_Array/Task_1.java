package by.tms.Homework_2_Array;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        int userArray[] = {1, 2, 3, 4, 5};

        for (int i = userArray.length - 1; i > 0; i--) {
            int x = userArray[i];
            int y = userArray[i - 1];
            userArray[i] = y;
            userArray[i - 1] = x;
        }
        System.out.println(Arrays.toString(userArray));
    }
}
