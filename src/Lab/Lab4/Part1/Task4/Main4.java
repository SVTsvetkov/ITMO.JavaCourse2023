package Lab.Lab4.Part1.Task4;

import java.util.Scanner;

//4.Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
// если второе число больше первого числа, а третье число больше второго числа.
// Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true
public class Main4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();
        System.out.println("Результат:" + isTrue(a, b, c));
    }

    public static boolean isTrue(int a, int b, int c) {

        return (a < b && b < c);
    }

}
