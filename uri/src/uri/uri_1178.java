
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1178 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double x;
        double v[] = new double[100];
        
        x = tec.nextDouble();
        
        v[0] = x;
        System.out.printf("N[0] = %.4f%n", v[0]);
        for (int i = 1; i < v.length; i++) {
            v[i] = v[i-1] / 2;
            
            System.out.printf("N[%d] = %.4f%n", i, v[i]);
        }
    }
}
