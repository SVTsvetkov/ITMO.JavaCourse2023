package Lab.Lab4.Part2.Task3;

import java.util.Arrays;
import java.util.Scanner;

//3.Напишите метод, который меняет местами первый и последний элемент массива.
// Пример вывода:
//Array 1: [5, 6, 7, 2]
//Array 2: [2, 6, 7, 5]
public class Task3 {
    public static void main(String[] args) {
        changePositionFirstLast(setArray());
    }
    public static int[] setArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scanner.nextInt();
        System.out.println("Numbers of array:");
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array1: " + Arrays.toString(array));
        return array;
    }
        public static void changePositionFirstLast(int[]array){
        int a = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = a;
        System.out.println("Array2: " + Arrays.toString(array));
    }
}
