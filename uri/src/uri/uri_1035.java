
package uri;

import java.util.Scanner;
import java.util.Locale;
public class uri_1035 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        int A, B, C, D;
        
        A = tec.nextInt();
        B = tec.nextInt();
        C = tec.nextInt();
        D = tec.nextInt();
        
        if(B > C && D > A && (C + D) > (A + B) &&  C > 0 && D > 0 && (A % 2) == 0)
            System.out.println("Valores aceitos");
        else System.out.println("Valores nao aceitos");
    }
    
}
