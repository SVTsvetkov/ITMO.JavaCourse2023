package Lab.Lab6.Task1;

public class BankEmployee extends Human {
    private String BankName;
    public BankEmployee(String Name, String Surname, String BankName) {
        super(Name, Surname);
        this.BankName = BankName;
    }
    @Override
    void display() {
        System.out.println("BankEmployee: " + getName() + getSurname() + "; BankName:" + BankName);
    }
}
