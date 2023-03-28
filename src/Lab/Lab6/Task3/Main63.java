package Lab.Lab6.Task3;

public class Main63 {
    public static void main(String[] args) {

        Car car1 = new Car(1500,"Kia", Color.GREEN, 150);
        Truck truck1 = new Truck(3000,"Kamaz", Color.RED, 100, 4, 5000);

        car1.outPut();
        truck1.newWheels(8);
        truck1.outPut();
    }
}
