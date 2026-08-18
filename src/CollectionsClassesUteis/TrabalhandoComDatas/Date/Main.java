package CollectionsClassesUteis.TrabalhandoComDatas.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static void main() {
        /*
        var date = new Date();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println(date);
        System.out.println(formatter.format(date));

         */

        var date = new Date(System.currentTimeMillis() - 999999999999L);
        System.out.println(date);

    }
}
