package animals;

import java.time.LocalTime;

public class Greetings {
    static void greetUser() {
        LocalTime midnight = LocalTime.of(23, 59);
        LocalTime fiveAM = LocalTime.of(5, 0);
        LocalTime twelvePM = LocalTime.of(12, 0);
        LocalTime sixPM = LocalTime.of(18, 0);
        LocalTime currentTime = LocalTime.now();

        if (currentTime.isAfter(LocalTime.of(0, 0)) && currentTime.isBefore(fiveAM) ||
            currentTime.equals(LocalTime.of(0, 0))) {
            System.out.println("Hey, Night Owl!");
        }
        else if (currentTime.isAfter(LocalTime.of(4, 59)) && currentTime.isBefore(twelvePM)) {
            System.out.println("Good morning!");
        }
        else if (currentTime.isAfter(LocalTime.of(11, 59)) && currentTime.isBefore(sixPM)) {
            System.out.println("Good afternoon!");
        }
        else if (currentTime.isAfter(LocalTime.of(17, 59)) && currentTime.isBefore(midnight) ||
                 currentTime.equals(LocalTime.of(23, 59))) {
            System.out.println("Good evening!");
        }
    }
}
