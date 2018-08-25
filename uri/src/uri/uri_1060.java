
package uri;

import java.util.Scanner;
import java.util.Locale;
public class uri_1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double vet[] = new double[6];
        int cont=0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            if(vet[i] > 0)
                cont++;
        }
        
        System.out.println(cont + " valores positivos");
    }
}
