
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1143 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x;
        
        do{
            x = tec.nextInt();
        }while(x < 1 || x > 1000);
        
        for (int i = 1; i <= x; i++) {
            System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
        }
    }
}
