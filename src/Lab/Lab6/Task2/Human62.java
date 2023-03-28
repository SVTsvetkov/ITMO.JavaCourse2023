package Lab.Lab6.Task2;

public abstract class Human62 implements GetNameSurmane {

    private String Name;
    private String Surname;

    public Human62(String Name, String Surname) {
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    abstract void display();
}


