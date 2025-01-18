package Clase;

public class AlarmExpiresException extends RuntimeException{
    public AlarmExpiresException(String description){
        super(description);
    }
}
