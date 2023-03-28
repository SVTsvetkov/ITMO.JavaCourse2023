package Lab.Lab6.Task5;

import java.util.Scanner;

public class Parent65 {
    private int Age;

    public void setData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int Number = sc.nextInt();
        Age = Number;
    }

    public void display() {
        System.out.println("Возраст: " + Age);
    }
}


