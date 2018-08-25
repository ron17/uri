
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int a, b;
        
        a = tec.nextInt();
        b = tec.nextInt();
        
        if(a >= b){
            if(a % b == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        }else{
            if(b % a == 0)
                System.out.println("Sao Multiplos");
            else
                System.out.println("Nao sao Multiplos");
        }
    }
}
