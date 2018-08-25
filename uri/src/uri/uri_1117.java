
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double n1, n2;
        
        do{
           n1 = tec.nextDouble();
           if(n1 < 0 || n1 > 10)
                System.out.println("nota invalida");
        }while(n1 < 0 || n1 > 10);
        
        do{
            n2 = tec.nextDouble();
            if(n2 < 0 || n2 > 10)
                System.out.println("nota invalida");
        }while(n2 < 0 || n2 > 10);
        
        System.out.printf("media = %.2f%n", ((n1 + n2) / 2));
        
        
    }
}
