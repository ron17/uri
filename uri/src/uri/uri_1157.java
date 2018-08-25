
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1157 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        n = tec.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                System.out.println(i);
        }
    }
}
