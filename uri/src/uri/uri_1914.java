
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1914 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        
        int qt, n1, n2;
        String t[] = new String[4];
        
        qt = tec.nextInt();
        
        for (int i = 0; i < qt; i++) {
            for (int j = 0; j < t.length; j++) {
                t[j] = tec.next();
            }
            n1 = tec.nextInt();
            n2 = tec.nextInt();
            
            
        }
        
       
        
        System.out.println(t[1]);
    }
}
