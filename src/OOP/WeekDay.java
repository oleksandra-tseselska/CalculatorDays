package OOP;

import java.util.Arrays;

public enum WeekDay {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String readableName;

    WeekDay(final String readableName){
        this.readableName = readableName;
    }

    public String getReadableName(){
        return readableName;
    }
}
