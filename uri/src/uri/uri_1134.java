
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1134 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, alcool=0, gas=0, diesel=0;
        
        do{
            x = tec.nextInt();
            
            switch (x){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }while(x != 4);
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gas);
        System.out.println("Diesel: "+diesel);
    }
}
