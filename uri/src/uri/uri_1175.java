
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1175 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n[] = new int[20];
        int aux;
        
        for (int i = 0; i < n.length; i++) {
            n[i] = tec.nextInt();
        }
        
        for (int i = 0, j = n.length-1 ; i < n.length / 2; i++, j--) {
            aux = n[i];
            n[i] = n[j];
            n[j] = aux;
            
        }
        
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
        
        
    }
}
