package datatypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.GregorianCalendar;

public class Koha {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
    }
}



