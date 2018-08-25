
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1173 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int vet[] = new int[10];
        int m=1;
        
        
        do{
            vet[0] = tec.nextInt();
        }while(vet[0] > 50);
            
        System.out.println("N[0] = "+vet[0]);
        m = vet[0];
        for (int i = 1; i < vet.length; i++) {
            vet[i] = vet[i-1] * 2;
            System.out.println("N["+i+"] = "+vet[i]);
        }
 
        
    }
}
