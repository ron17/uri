

package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        final double peso1 = 3.5, peso2 = 7.5;
        double A, B;
        
        A = tec.nextDouble();
        B = tec.nextDouble();
        
        System.out.printf("MEDIA = %.5f%n", ((A * peso1 + B * peso2) / (peso1 + peso2)));
    }
}
