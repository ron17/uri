
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1142 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, j = 1;
        
        do{
            x = tec.nextInt();
        }while(x <= 0);
        
        
            for (; j <= x*4; j++) {
                if(j % 4 == 0){
                    System.out.println("PUM");
                   
                }else
                    System.out.print(j + " ");
                    
                
            }
            
            
        
    }
}
