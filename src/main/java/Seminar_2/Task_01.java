package Seminar_2;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String string = readStr();
        System.out.println(Palindrome(string));
    }

    public static String readStr() {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        in.close();
        return string;
    }

    public static boolean Palindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
}