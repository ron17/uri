
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1930 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n1, n2, n3, n4;
        
        n1 = tec.nextInt();
        n2 = tec.nextInt();
        n3 = tec.nextInt();
        n4 = tec.nextInt();
        
        System.out.println((n1 - 1) + (n2 - 1) + (n3 - 1) + n4);
    }
    
}
