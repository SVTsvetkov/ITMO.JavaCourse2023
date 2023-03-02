package Lab.Lab1.Task5;

import java.util.Scanner;

//В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
//целое число нужно печатать с новой строки. Формат ввода:
//42
//100
//125
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число 42");
        int a = scanner.nextInt();
        System.out.println("введите число 100");
        int b = scanner.nextInt();
        System.out.println("введите число 125");
        int c = scanner.nextInt();
        System.out.println("вы ввели:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
