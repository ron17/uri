
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1789 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        while(tec.hasNext()){
            int l, v, m=0;
            
            do{
                l = tec.nextInt();
            }while(l < 1 || l > 500);
            
            for (int i = 0; i < l; i++) {
                do{
                    v = tec.nextInt();
                }while(v < 1 || v > 50);
                
                if(v > m)
                    m = v;
            }
            
            if(m < 10)
                System.out.println(1);
            else if(m >= 10 && m < 20)
                System.out.println(2);
            else if(m >= 20)
                System.out.println(3);
        }
    }
}
