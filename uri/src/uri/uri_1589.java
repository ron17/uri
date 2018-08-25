
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1589 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int t, r1, r2;
        
        do{
            t = tec.nextInt();
        }while(t > 10000);
        
        for (int i = 0; i < t; i++) {
            r1 = tec.nextInt();
            r2 = tec.nextInt();
            
            System.out.println(r1+r2);
        }
    }
}
