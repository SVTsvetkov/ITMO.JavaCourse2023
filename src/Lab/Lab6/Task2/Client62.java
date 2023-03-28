package Lab.Lab6.Task2;

public class Client62 extends Human62 implements PrintBank {
    private String BankName;
    public Client62(String Name, String Surname, String BankName) {
        super(Name, Surname);
        this.BankName = BankName;
    }

    @Override
    public void display() {
        System.out.println("BankEmployee: " + getName() + getSurname());
    }

    @Override
    public void printBankName() {
        System.out.println("BankName:" + BankName);
    }
}
