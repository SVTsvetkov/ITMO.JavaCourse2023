package Lab.Lab5.Task2;
//2.Написать метод, который проверяет является ли слово палиндромом.

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово:");
        String s = scan.next();
        isPalindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r = r + s.charAt(i);
        return r;
    }

    public static Boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }
}

