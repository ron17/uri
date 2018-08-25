
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1158 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, x , y, soma=0;
        
        n = tec.nextInt();
        
        for (int j = 0; j < n; j++) {
                    
            x = tec.nextInt();
            y = tec.nextInt();
            soma = 0;
        
            for (int i = 0; i < y; i++) {
                if(x % 2 != 0)
                    soma+= x;
                else{
                    x++;
                    soma+= x;
                }
            
                x+=2;
            }
        
        
            System.out.println(soma);
        }
    }
}
