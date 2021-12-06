package by.tms.Homework_2_Array;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 3, 5, 4, 6};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
