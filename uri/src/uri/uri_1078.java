
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1078 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        do{
            n = tec.nextInt();
        }while(n < 2 || n > 1000);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n +" = "+ (i * n));
        }
    }
}
