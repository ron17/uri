
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1929 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int a, b, c , d;
        
        a = tec.nextInt();
        b = tec.nextInt();
        c = tec.nextInt();
        d = tec.nextInt();
        
        if((b > a && c > b) || (c > b && d > c))
            System.out.println("S");
        else
            System.out.println("N");
    }
}
