package by.tms.Homework_1_Cycle;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int usernumber = in.nextInt();
        int sum = 0;
        while (usernumber != 0) {
            sum = sum + (usernumber % 10);
            usernumber = usernumber / 10;
        }
        System.out.println("The sum is " + sum);
    }
}
