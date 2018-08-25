
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double n1, n2;
        int i=0;
        
        do{
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
        
            do{
            System.out.println("novo calculo (1-sim 2-nao)");
            i = tec.nextInt();
            }while(i != 2 && i!=1);
            
            
        }while(i != 2);
    }
}
