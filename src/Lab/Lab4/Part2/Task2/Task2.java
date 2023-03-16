package Lab.Lab4.Part2.Task2;

import java.util.Arrays;
import java.util.Scanner;

//2.Напишите программу, которая считывает с клавиатуры длину массива
// (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и
// на новой строке выводится массив из 4 элементов.
// Пример вывода:
//   Array length: 4
//   Numbers of array:
//   5
//   6
//   7
//   2
//   Result: [5, 6, 7, 2]
public class Task2 {
    public static void main(String[] args) {
        setArray();
    }

    public static void setArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scanner.nextInt();
        System.out.println("Numbers of array:");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result" + Arrays.toString(array));
    }
}
