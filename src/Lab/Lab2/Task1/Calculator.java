package Lab.Lab2.Task1;
//Создать класс Calculator. У него должны быть методы:
//-	Сумма
//-	Деление
//-	Умножение
//-	Вычитание
//Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

public class Calculator {
    public static int sum(int a, int b) { return a + b;}
    public static double sum(double a, double b) {
        return a + b;
    }
    public static long sum(long a, long b) {
        return a + b;
    }
    public static double division(int a, int b) {
        return (double) a / b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
    public static double division(long a, long b) {
        return (double) a / b;
    }
    public static int multiplication(int a, int b) { return a * b; }
    public static double multiplication(double a, double b) { return a * b; }
    public static long multiplication(long a, long b) { return a * b; }
    public static int deduction(int a, int b) { return a - b; }
    public static double deduction(double a, double b) { return a - b; }
    public static long deduction(long a, long b) { return a - b; }
}
