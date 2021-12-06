package by.tms.Homework_2_Array;

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7};
        int[] arraySecond = {2, 4, 6, 8};
        int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arrayResult.length; i++) {
            if (j == k) {
                arrayResult[i] = arrayFirst[j];
                j++;
            } else {
                arrayResult[i] = arraySecond[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(arrayResult));
    }
}
