
package uri;


import java.util.Locale;
import java.util.Scanner;


public class uri_1564 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
         int n;
        while (tec.hasNext()) {
            do{
                n = tec.nextInt();
            }while(n < 0 || n > 100);
            
            if(n > 0)
                System.out.println("vai ter duas!");
            else if (n == 0)
                System.out.println("vai ter copa!");
        }
        
        
        
        
        
        
    }
}
