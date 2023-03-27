package Lab.Lab6.Task2;

public class BankEmployee62 extends Human62 {
    private String BankName;

    public BankEmployee62(String Name, String Surname, String BankName) {
        super(Name, Surname);
        this.BankName = BankName;
    }

    @Override
    void display() {
        System.out.println("BankEmployee: " + getName() + getSurname() + "; BankName:" + BankName);
    }
}