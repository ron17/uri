
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1132 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, y, soma=0;
        
        x = tec.nextInt();
        y = tec.nextInt();
        
        if(x > y){
            for (; y <= x; y++) {
                if(y % 13 != 0)
                    soma+=y;
            }
        }else if (y > x){
            for (; x <= y; x++) {
                if(x % 13 != 0)
                    soma+=x;
            }
        }
        System.out.println(soma);
    }
}
