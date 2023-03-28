package Lab.Lab6.Task1;

public class Client extends Human {
    private String BankName;
    public Client(String Name, String Surname, String BankName) {
        super(Name, Surname);
        this.BankName = BankName;
    }
    @Override
    void display() {
        System.out.println("Client: " + getName() + getSurname() + "; BankName:" + BankName);
    }

}
