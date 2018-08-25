
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double a, b, c;
        
        a = tec.nextDouble();
        b = tec.nextDouble();
        c = tec.nextDouble();
        
        if((a + b) > c && (a + c) > b && (b + c) > a)
            System.out.printf("Perimetro = %.1f%n", (a + b + c));
        else
            System.out.printf("Area = %.1f%n", (((a + b) * c) / 2));
         
    }
}
