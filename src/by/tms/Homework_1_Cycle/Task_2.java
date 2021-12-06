package by.tms.Homework_1_Cycle;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input a number: ");
        int userNumber = number.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for (int i = 1; userNumber > num3; i++) {
            System.out.println(num3);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
