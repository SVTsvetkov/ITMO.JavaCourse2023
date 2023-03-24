package Lab.Lab5.Task1;
//1.Написать метод для поиска самого длинного слова в тексте.

import java.util.Arrays;

public class Task51 {
    public static void main(String[] args) {
        String s = "метод для поиска самого длинного";
        LongestWord(s);
    }

    private static String LongestWord(String s) {
        String words[] = s.split(" ");
        Arrays.sort(words);
        int a = 0;
        String longest = "";
        for (String string : words) {
            if (string.length() > a) {
                a = string.length();
                longest = string;
            }
        }
        System.out.println("Самое длинное слово в тексте: " + longest);
        return longest;
    }
}

