
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1177 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int t, aux;
        
        do{
            t = tec.nextInt();
        }while(t < 2 || t > 50);
        
        int n[] = new int[1000];
        
        aux = 0;
        
        
        for (int i = 0; i < n.length; i++, aux++) {
            
            n[i] = aux;
            if(aux == t){
                aux=0;
                n[i] = aux;
                
            }
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
