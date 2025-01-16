package Clase;
import java.time.LocalDate;

public class Alarm {
    Client client;
    String description;
    LocalDate time;
    boolean status;

    public Alarm(Client client, String description, LocalDate time, boolean status) {
        this.client = client;
        this.description = description;
        this.time = time;
        this.status = status;
    }

    public void AlarmExpiresException() {
        if(status) {
            System.out.println(description);
        }
    }
}
