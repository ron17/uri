
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1864 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        String texto = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        
        int n;
        do{
            n = tec.nextInt();
        }while(n < 1 || n > 34);
        
        System.out.println(texto.substring(0, n));
    }
}
