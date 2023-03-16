package Lab.Lab4.Part1.Task5;

import java.util.Arrays;
import java.util.Scanner;

//5.Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний
// элемент массива целых чисел.
// Длина массива должна быть больше или равна двум.
// Пример вывода:
//array = 3, -3, 7, 4, 5, 4, 3
//true
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива(не менее двух элементов)");
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("введите" + i + "элемент массива: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("введён массив:" + Arrays.toString(array));
        System.out.println("число три в массиве - первый или последний элемент: " + IfThreeInArray(array));
    }

    public static boolean IfThreeInArray(int[] array) {
        return (array[0] == 3 || array[array.length - 1] == 3);
    }

}
