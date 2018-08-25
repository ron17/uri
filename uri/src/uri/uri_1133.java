
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1133 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, y;
        
        x = tec.nextInt();
        y = tec.nextInt();
        
        if(y > x){
            for (x++; x < y; x++) {
                if(x % 5 == 2 || x % 5 == 3)
                    System.out.println(x);
        }
        }else if(x > y){
            for (y++; y < x; y++) {
                if(y % 5 == 2 || y % 5 == 3)
                    System.out.println(y);
            }
        }
    }
}
