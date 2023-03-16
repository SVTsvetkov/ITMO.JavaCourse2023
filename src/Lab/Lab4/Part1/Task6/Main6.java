package Lab.Lab4.Part1.Task6;

import java.util.Arrays;
import java.util.Scanner;

//6.Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("введите" + i + "элемент массива: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("введён массив:" + Arrays.toString(array));
        System.out.println("массив содержит число один или три: " + IfOneThreeInArray(array));
    }

    public static boolean IfOneThreeInArray(int[] array) {
        for (int num : array) {
            return (num == 1 || num == 3);
        }
        return false;
    }
}

