
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1866 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int c, s=0, n;
        
        c = tec.nextInt();
        
        for (int i = 1; i <= c; i++) {
            n = tec.nextInt();
            
            for (int j = 0; j < n; j++) {
                if(j % 2 != 0)
                    s -= 1;
                else
                    s += 1;
                
                
            }
            System.out.println(s);
            s=0;
            
        }
        
        
    }
}
