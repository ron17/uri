
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double vet[] = new double[6];
        double soma=0;
        int cont=0;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            if(vet[i] > 0){
                cont++;
                soma+=vet[i];
            }
        }
        
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f%n", soma / cont);
    }
}
