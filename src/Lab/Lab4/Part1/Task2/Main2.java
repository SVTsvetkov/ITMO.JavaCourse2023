package Lab.Lab4.Part1.Task2;

//2.Напишите программу, которая выводит числа от 1 до 100,
// которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
// Пример вывода:
//	Делится на 3: ….
//	Делится на 5: ….
//	Делится на 3 и на 5: ….
public class Main2 {
    public static void main(String[] args) {
        printNumbersDivisionThreeFive(1, 100);
    }

    public static void printNumbersDivisionThreeFive(int first, int last) {
        System.out.println("делится на 3:");
        for (int i = first; i < last; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("делится на 5:");
        for (int i = first; i < last; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("делится на 3 и на 5:");
        for (int i = first; i < last; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
