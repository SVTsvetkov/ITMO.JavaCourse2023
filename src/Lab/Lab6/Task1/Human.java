package Lab.Lab6.Task1;

import javax.naming.Name;

public abstract class Human {
    private String Name;
    private String Surname;

    public Human(String Name, String Surname) {
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






