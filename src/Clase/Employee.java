package Clase;

public class Employee extends Person{
    String username;
    String firstName;
    String lastName;
    String password;

    public Employee(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
}
