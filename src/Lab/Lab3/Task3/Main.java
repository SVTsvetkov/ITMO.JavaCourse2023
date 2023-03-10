package Lab.Lab3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(5, 2015, "жилой");
        house2.setHouse(3, 1992, "поликлиника");
        house1.display();
        System.out.println("количество лет с момента постройки:" + house1.difference());
        house2.display();
        System.out.println("количество лет с момента постройки:" + house2.difference());

    }

}
