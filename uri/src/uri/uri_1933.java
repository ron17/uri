
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1933 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int a, b;
        
        a = tec.nextInt();
        b = tec.nextInt();
        
        if(a == b)
            System.out.println(a);
        else if(a > b)
            System.out.println(a);
        else if(a < b)
            System.out.println(b);
    }
}
