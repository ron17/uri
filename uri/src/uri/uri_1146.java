
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1146 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x;
        
        do{
            x = tec.nextInt();
            
            for (int i = 1; i <= x; i++) {
                if(i != x)
                    System.out.print(i + " ");
                else
                    System.out.println(i);
            }
        }while(x != 0);
    }
}
