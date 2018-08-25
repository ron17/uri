
package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1759 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n;
        
        do{
            n = tec.nextInt();
        }while(n < 0 || n > Math.pow(10, 6));
        
        for (int i = 0; i < n; i++) {
            if(i != n-1)
                System.out.print("Ho ");
            else
                System.out.println("Ho!");
        }
    }
}
