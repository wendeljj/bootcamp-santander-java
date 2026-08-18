package CollectionsClassesUteis.TrabalhandoComBigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    static void main() {
        BigDecimal bigDecimal = new BigDecimal("12");
        BigDecimal bigDecimal2 = new BigDecimal("4");

        BigDecimal bigResult;

        bigResult = bigDecimal2.sqrt(new MathContext(12));

       System.out.println(bigResult);
    }
}
