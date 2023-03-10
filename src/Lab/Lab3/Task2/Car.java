package Lab.Lab3.Task2;

import Lab.Lab2.Task2.Color;

public class Car {
    private Color color;
    private String name;
    private Integer weight;

    public Car() {

    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void display() {

        System.out.println("цвет:" + color + ", название:" + name + ", вес:" + weight);
    }


}
