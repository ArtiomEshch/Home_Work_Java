package by.tms.Homework_3_String;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Rome Number: ");
        String userNumber = in.next();
        char[] romeCharNumberArray = userNumber.toCharArray();
        int[] romeIntNumberArray = new int[romeCharNumberArray.length];
        int resulArabNumber = romeCharNumberArray[0];

        for (int i = 0; i < romeCharNumberArray.length; i++) {

            if (romeCharNumberArray[i] == 'M') {
                romeIntNumberArray[i] = 1000;
            } else if (romeCharNumberArray[i] == 'D') {
                romeIntNumberArray[i] = 500;
            } else if (romeCharNumberArray[i] == 'C') {
                romeIntNumberArray[i] = 100;
            } else if (romeCharNumberArray[i] == 'L') {
                romeIntNumberArray[i] = 50;
            } else if (romeCharNumberArray[i] == 'X') {
                romeIntNumberArray[i] = 10;
            } else if (romeCharNumberArray[i] == 'V') {
                romeIntNumberArray[i] = 5;
            } else if (romeCharNumberArray[i] == 'I') {
                romeIntNumberArray[i] = 1;
            } else {
                System.out.println("Your number contains an incorrect value.");
            }
            resulArabNumber = romeIntNumberArray[i];
        }
//        System.out.println(Arrays.toString(romeIntNumberArray));
        for (int i = 0; i < romeIntNumberArray.length; i++) {
            resulArabNumber = romeIntNumberArray[i] > romeIntNumberArray[i+1] ?
                    romeIntNumberArray[i] - romeIntNumberArray[i+1] :
                    romeIntNumberArray[i] + romeIntNumberArray[i+1];
        }
    }
}
// не смог решить. Ход мыслей такой:
//1. Сделать из числа массив чисел;
//2. Затем сравнивать с римскими цфрами и формировать в цикле массив символов (из римских чисел)
//3. Затем делать из массива символов строку и выводить результат.
