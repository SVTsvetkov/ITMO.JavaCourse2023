package Lab.Lab4.Part2.Task4;

import java.util.Arrays;
//4.Дан массив чисел. Найдите первое уникальное в этом массиве число.
// Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        firstUniqueNum(array);
    }
    public static void firstUniqueNum(int[]array){

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("задан массив: " + Arrays.toString(array));
                System.out.println("первое уникальное в этом массиве число : " + array[i]);
                return;
            }
        }
    }
}
