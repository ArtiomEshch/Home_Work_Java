package by.tms.Homework_1_Cycle;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of days: ");
        int day = in.nextInt();
        int precMax = 0;
        int precFinal = 0;
        for (int i = 1; i <= day; i++) {
            System.out.print("Input value of precipitation: ");
            int prec = in.nextInt();
            if (precMax < prec) {
                precMax = prec;
            }
            precFinal = precFinal + prec;
        }
        int precMid = precFinal / day;
        System.out.print("Days: " + day +
                "; Precipitation sum: " + precFinal +
                ": Middle precipitation " + precMid +
                "; Max precipitation " + precMax);
    }
}
