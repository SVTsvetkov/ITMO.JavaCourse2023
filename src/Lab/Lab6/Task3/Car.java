package Lab.Lab6.Task3;

public class Car {
    public int weight;
    public String model;

    public Color color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }
    public Car(int w, String m, Color c, float s) {
        this.weight = w;
        this.model = m;
        this.color = c;
        this.speed = s;
    }
    public Car() {

    }
}
