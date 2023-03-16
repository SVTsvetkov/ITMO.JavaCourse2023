package Lab.Lab4.Part1.Task3;

import java.util.Scanner;

//3.Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
// если сумма равна третьему целому числу.
// Пример вывода:
//Введите первое число: 5
//Введите второе число: 10
//Введите третье число: 15
//Результат: true
public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите третье число:");
        int c = scanner.nextInt();

        System.out.println("Результат:" + isTrue(a, b, c));
    }

    public static boolean isTrue(int a, int b, int c) {

        return (a + b) == c;
    }
}


