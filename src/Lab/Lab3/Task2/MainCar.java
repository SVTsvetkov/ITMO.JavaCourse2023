package Lab.Lab3.Task2;

import Lab.Lab2.Task2.Color;
import jdk.nashorn.internal.runtime.ListAdapter;

public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car(Color.WHITE, 1100);
        Car car2 = new Car(Color.GREEN);
        car1.display();
        car2.display();

    }
}
