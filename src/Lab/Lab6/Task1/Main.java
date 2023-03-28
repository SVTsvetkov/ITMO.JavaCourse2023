package Lab.Lab6.Task1;

public class Main {
    public static void main(String[] args) {

        Human client = new Client("Ivan", " Ivanov", " SPB");
        Human bankEmployee = new BankEmployee("Fedor", " Fedorov", " VTB");

        client.display();
        bankEmployee.display();
    }
}
