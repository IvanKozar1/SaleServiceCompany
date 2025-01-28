package Clase;
import java.time.LocalDate;

public class Client extends Person{
    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    LocalDate birthDate;

    public Client(String id, String firstName, String lastName, String phoneNumber, String email, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
    }
}
