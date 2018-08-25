
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1074 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        String frase ="";
        
        do{
            n = tec.nextInt();
        }while(n > 10000);
        
        int x[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            do{
                x[i] = tec.nextInt();
            }while(x[i] > Math.pow(10, 7) || x[i] < Math.pow(-10, 7));
        }
        
        for (int i = 0; i < n; i++) {
            if(x[i] % 2 == 0)
                frase = "EVEN";
            else
                frase = "ODD";
            
            if(x[i] > 0)
                frase = frase + " POSITIVE";
            else if(x[i] < 0)
                frase = frase + " NEGATIVE";
            else
                frase = "NULL";
            
            System.out.println(frase);
            
                
        }
    }
}
