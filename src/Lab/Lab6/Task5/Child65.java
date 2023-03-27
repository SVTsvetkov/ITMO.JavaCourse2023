package Lab.Lab6.Task5;

import java.util.Scanner;

public class Child65 extends Parent65 {
    private String Name;

    @Override
    public void setData() {
        super.setData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String Number = sc.nextLine();
        Name = Number;
    }

    @Override
    public void display() {
        super.display();
        System.out.print("Имя: " + Name);
    }
}
