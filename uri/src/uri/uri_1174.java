
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1174 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double vet[] = new double[100];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            
            if(vet[i] <= 10)
                System.out.printf("A[%d] = %.1f%n", i,vet[i]);
        }
    }
}
