
package uri;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;


public class uri_1155 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        double s=0, a, c;
        
        for(a=1; a<=100; a++)
        {
            c=1/a;
            s+=c;
        }
        
        BigDecimal bd = new BigDecimal(s).setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(bd.doubleValue());
    }
}
