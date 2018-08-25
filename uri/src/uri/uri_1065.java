
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double vet[] = new double[5];
        int cont=0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            if(vet[i] % 2 == 0)
                cont++;
        }
        
        System.out.println(cont + " valores pares");
        
    }
}
