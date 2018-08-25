
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1006 {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        
        double A, B, C;
        final double peso1 = 2, peso2= 3, peso3=5;
        
        A = tec.nextDouble();
        B = tec.nextDouble();
        C = tec.nextDouble();
        
        System.out.printf("MEDIA = %.1f%n", (((A * peso1) + (B * peso2) + (C * peso3)) / (peso1 + peso2 + peso3)));
        
    }
    
}
