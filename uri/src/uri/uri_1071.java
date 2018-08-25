
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1071 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, y, aux, soma=0;
        
        
        x = tec.nextInt();
        y = tec.nextInt();
        
           
         
            
        
        for (int i = y+1; i < x; i++) {
            if(i % 2 != 0)
                soma+= i;
                
            
        }
        
        System.out.println(soma);
    }
}
