
package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1075 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        n = tec.nextInt();
        
        for (int i = 1; i < 10000; i++) {
            if(i % n == 2)
                System.out.println(i);
        }
    }
}
