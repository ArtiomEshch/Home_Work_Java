package by.tms.Homework_2_Array;

import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 4, 5}, {2, 4, 6, 8}};
        System.out.println(Arrays.toString(linearize(array)));
    }

    public static int[] linearize(int[][] arrayToProcess) {
        int arrayResultLength = 0;
        for (int i = 0; i < arrayToProcess.length; i++) {
            for (int j = 0; j < arrayToProcess[i].length; j++) {
                arrayResultLength++;
            }
        }
        int[] arrayResult = new int[arrayResultLength];
        int h = 0;
        for (int i = 0; i < arrayToProcess.length; i++) {
            for (int j = 0; j < arrayToProcess[i].length; j++) {
                arrayResult[h] = arrayToProcess[i][j];
                h++;
            }
        }
        return arrayResult;
    }
}
