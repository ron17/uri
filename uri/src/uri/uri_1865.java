
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1865 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, c;
        String t;
        
        n = tec.nextInt();
        
        for (int i = 0; i < n; i++) {
            t = tec.next();
            c = tec.nextInt();
            
            if(t.equalsIgnoreCase("Thor"))
                System.out.println("Y");
            else
                System.out.println("N");
                
            
        }
    }
}
