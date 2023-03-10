package Lab.Lab3.Task3;

import java.util.Scanner;

public class House {
    private int floorQty;
    private int constructYear;
    private String name;

    public void setHouse(int floorQty, int constructYear, String name) {
        this.floorQty = floorQty;
        this.constructYear = constructYear;
        this.name = name;
    }

    public void display() {
        System.out.println("назначение:" + name + ", этажей: " + floorQty + ", год постройки:" + constructYear);
    }

    public int difference() {
        int currentYear = 2023;
        return currentYear - this.constructYear;
    }

}
