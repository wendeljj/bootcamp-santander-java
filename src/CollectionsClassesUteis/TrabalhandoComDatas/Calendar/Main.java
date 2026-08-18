package CollectionsClassesUteis.TrabalhandoComDatas.Calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    static void main() {

        var calendar = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z");

        System.out.println(formatter.format(calendar.getTime()));

    }
}
