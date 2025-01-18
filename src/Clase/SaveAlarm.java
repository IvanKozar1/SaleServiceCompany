package Clase;

import java.time.LocalDate;

public class SaveAlarm extends Alarm{
    Alarm[]  alarms;
    public SaveAlarm(Client client, String description, LocalDate time, boolean status, int numAlarms){
        super(client, description, time, true);
        this.alarms = new Alarm[numAlarms];
    }
    public void addAlarm(Alarm alarm, int alarmIndex){
        alarms[alarmIndex] = alarm;
    }
    public void AlarmExpiresException() {
        for (Alarm alarm : alarms) {
            if (status) {
                System.out.println(description);
            }
        }
    }
}

