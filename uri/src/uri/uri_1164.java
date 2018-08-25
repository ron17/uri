
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1164 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int N, X, a, b, c, d=0;
        
        do{
            N = tec.nextInt();
        }while(N < 1 || N > 20);
        
        for (a = 1; a <= N; a++) {
            do{
            X = tec.nextInt();
            }while(X < 1 || X > Math.pow(10, 8));
            
            c = X / 2; d = 0;
            for (b = 1; b <= c; b++) {
                if(X%b==0)
                d+=b;
            }
            if(d==X)
                System.out.printf("%d eh perfeito\n",X);
            else
                System.out.printf("%d nao eh perfeito\n",X);
        }
        
        
        
        
            
      
    }
}
