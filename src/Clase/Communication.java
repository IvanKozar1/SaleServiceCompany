package Clase;

import java.time.LocalDate;
import java.util.List;

enum CommunicationType {
    Email,
    Phone,
    SMS
}

public class Communication {
    Client client;
    Employee employee;
    CommunicationType communicationType;
    String content;
    LocalDate time;
}
