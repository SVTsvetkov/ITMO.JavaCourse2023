package Lab.Lab4.Part2.Task1;

//1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
// Если он отсортирован по возрастанию то выводится “OK”,
// если нет, то будет выводиться текст “Please, try again”
public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 23, 4, 5};
        isSorted(array);
    }

    public static void isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }
}
