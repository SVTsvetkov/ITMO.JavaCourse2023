package Lab.Lab1.Task6;

import java.util.Scanner;

//Для целого числа b выполните следующие условные действия:
//● Если b нечетное, выведите “Нечетное”
//● Если b четное, выведите “Четное”
//● Если b четное и больше 100, выведите “Выход за пределы диапазона”
//! Использовать класс Scanner: int b = scanner.nextInt();
public class Main {
    public static void main(String[] args) {

        System.out.println("введите целое цисло");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            if (b % 2 != 0) {
                System.out.println("Нечётное");
            } else {
                System.out.println("Чётное");
            }
        }


    }
}
