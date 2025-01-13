package Clase;
import java.time.LocalDate;

public class Alarm {
    Client[] clients;
    String description;
    LocalDate time;
    boolean status;

    public Alarm(int numOfClients, String description, LocalDate time, boolean status) {
        this.clients = new Client[numOfClients];
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