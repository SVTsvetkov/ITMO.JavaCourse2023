package Lab.Lab2.Task2;

public class Bicycle {

    private String brand;
    private String model;
    private Type type;
    private Integer price;
    private Color color;

    public Bicycle(){

    }

    public Bicycle(String brand,Type type, Integer price, Color color) {

        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
