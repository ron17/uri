
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1067 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x;
        
        do{
        x = tec.nextInt();
        }while(x < 1 || x > 1000);
        
        for (int i = 1; i <= x; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
