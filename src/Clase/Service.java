package Clase;
import java.math.BigDecimal;
import java.util.Date;

public class Service {
    Client client;
    String type;
    String description;
    Date date;
    BigDecimal price;
    boolean completed;
    boolean charged;

    public Service(Client client, String type, String description, Date date, BigDecimal price, boolean completed, boolean charged){
        this.client = client;
        this.type = type;
        this.description = description;
        this.date = date;
        this.price = price;
        this.completed = completed;
        this.charged = charged;
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
}
