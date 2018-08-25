
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1145 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, y;
        
        do{
            
            x = tec.nextInt();
            y = tec.nextInt();
            
        }while(x < 1 || x > 20 || y < x || y > 100000);
        
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++, i++) {
                if(i <= y){
                    if(j != x)
                        System.out.print(i + " ");
                    else
                        System.out.println(i);
                }
                
                
            }

            i--;
        }
    }
}
