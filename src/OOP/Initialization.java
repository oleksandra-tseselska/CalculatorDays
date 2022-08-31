package OOP;

import java.util.Scanner;

public interface Initialization {

    default String initialisation(){
        Scanner start = new Scanner(System.in);
        System.out.println("Enter day of week please");
        String dayOfWeek = start.nextLine();
        return dayOfWeek;
    }
}
