
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1959 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, l;
        
        do{
            n = tec.nextInt();
            l = tec.nextInt();
        }while(n < 3 || n > 1000000 || l < 1 || l > 4000);
        
        System.out.println(n * l);
    }
}
