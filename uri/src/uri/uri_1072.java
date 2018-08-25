
package uri;
import java.util.Scanner;
import java.util.Locale;

public class uri_1072 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, x, in=0, out=0;
        
        do{
            n = tec.nextInt();
        }while(n > 10000);
        
        for (int i = 0; i < n; i++) {
            do{
                x = tec.nextInt();
            }while(x > Math.pow(10, 7) || x < Math.pow(-10, 7));
            
            if(x >= 10 && x <= 20)
                in++;
            else
                out++;
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
