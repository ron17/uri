
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1153 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, mult=1;
        
        do{
            n = tec.nextInt();
        }while(n < 0 || n > 13);
        
        for (int i = n; i > 0; i--) {
            mult*=i;
        }
        
        System.out.println(mult);
    }
}
