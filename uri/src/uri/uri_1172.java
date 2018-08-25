
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1172 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int vet[] = new int[10];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextInt();
            
            if(vet[i] <= 0)
                vet[i] = 1;
        }
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println("X["+i+"] = " + vet[i]);
        }
    }
}
