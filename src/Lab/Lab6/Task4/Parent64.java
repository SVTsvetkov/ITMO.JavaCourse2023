package Lab.Lab6.Task4;

import java.util.Scanner;

public class Parent64 {
    protected Integer Num;

    public void inputNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int Number = sc.nextInt();
        Num = Number;
    }


}
