package Lab.Lab6.Task2;


public class Main62 {
    public static void main(String[] args) {

        Client62 client = new Client62("Ivan", " Ivanov", " KTB");
        Human62 bankEmployee = new BankEmployee62("Fedor", " Petrov", " MTB");

        client.display();
        client.printBankName();
        bankEmployee.display();

    }
}

