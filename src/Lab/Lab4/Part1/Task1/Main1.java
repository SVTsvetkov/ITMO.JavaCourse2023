package Lab.Lab4.Part1.Task1;

//1.Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
// Каждое число печатается с новой строки.
public class Main1 {
    public static void main(String[] args) {
        printOddNumbers(1, 100);
    }

    public static void printOddNumbers(int first, int last) {
        int num = first;
        while (num < last) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
