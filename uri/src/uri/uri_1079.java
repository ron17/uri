
package uri;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;


public class uri_1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        float n1, n2, n3;
        float media;
        
        n = tec.nextInt();
        
        for (int i = 1; i <= n; i++) {
            n1 = tec.nextFloat();
            n2 = tec.nextFloat();
            n3 = tec.nextFloat();
            
            media= ((n1 * 2 ) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("%.1f%n", media);
        }
        
       
        
    }
}
