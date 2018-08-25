
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1151 {
    
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        do{
            n = tec.nextInt();
        }while(n < 0 || n > 46);
        
        
        
        for (int i = 0; i < n; i++) {
            if(i != n-1)
            System.out.print(fibo(i) + " ");
            else
                System.out.println(fibo(i));
        }
    }
    
          
}
