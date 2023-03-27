package Lab.Lab6.Task3;

public class Truck extends Car {
    private Integer WheelsNum;
    private Integer WeightMax;

    public Integer getWeightMax() {
        return WeightMax;
    }
    public Integer newWheels(Integer number) {
        WheelsNum = number;
        System.out.println("Количество колес: " + WheelsNum);
        return WheelsNum;
    }

    public Truck(int w, String m, Color c, float s, int WeelsNum, int WeightMax) {
        super(w, m, c, s);
        this.WheelsNum = WeelsNum;
        this.WeightMax = WeightMax;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + WheelsNum + "; Максимальный вес: "+ getWeightMax());

    }

}


