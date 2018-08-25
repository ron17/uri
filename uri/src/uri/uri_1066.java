
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double vet[] = new double[5];
        int par=0, impar=0, pos=0, neg=0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            if(vet[i] % 2 == 0)
                par++;
            if(vet[i] % 2 != 0)
                impar++;
            if(vet[i] > 0)
                pos++;
            if(vet[i] < 0)
                neg++;
        }
        
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
 
}
