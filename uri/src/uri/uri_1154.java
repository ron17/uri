
package uri;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;


public class uri_1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double id, soma=0, i=0;
        double media;
        
        do{
            id = tec.nextDouble();
            
            if(id >= 0){
                soma+=id;
                i++;
            }
        }while(id >= 0);
        
        
        
        
        System.out.printf("%.2f%n", soma/i);
    }
}
