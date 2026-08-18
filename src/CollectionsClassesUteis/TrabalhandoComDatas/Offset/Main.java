package CollectionsClassesUteis.TrabalhandoComDatas.Offset;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {
    static void main() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        System.out.println(offsetDateTime);
    }
}
