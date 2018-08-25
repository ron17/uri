
package uri;

import java.util.Locale;
import java.util.Scanner;



public class uri_1070 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x;
        
        
        x = tec.nextInt();
        
        if(x % 2 == 0){
            for (int i = x; i <= x+11; i++) {
                if(i % 2 != 0)
                    System.out.println(i);
            }
        }
        else
        {
           for (int i = x; i <= x+10; i++) {
                if(i % 2 != 0)
                    System.out.println(i);
            } 
        }
    }
}
