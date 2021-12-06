package by.tms.Homework_3_String;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Input a string: ");
        String userString = string.next();
        StringBuffer reverceString = new StringBuffer(userString);
        reverceString.reverse();
        if (userString.equals(reverceString.toString())) {
            System.out.println("Your string is palindrome.");
        } else {
            System.out.println("Your string isn't palindrome.");
        }
    }
}
