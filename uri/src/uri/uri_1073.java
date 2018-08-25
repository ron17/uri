
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1073 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        do{
            n = tec.nextInt();
        }while(n < 5 || n > 2000);
        
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println(i+"^2 = "+(int)Math.pow(i, 2));
            }
        }
    }
}
