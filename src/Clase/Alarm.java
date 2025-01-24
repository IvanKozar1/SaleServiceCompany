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
   
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public boolean isActive() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
