
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1847 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int a, b, c;
        
        
        a = tec.nextInt();
        b = tec.nextInt();
        c = tec.nextInt();
        
        if(a > b && c >= b) System.out.println(":)");
        else if(b > a && (c <= b)) System.out.println(":(");
        else if(b > a && c > b && (c - b) < (b - a)) System.out.println(":(");
        else if(b > a && c > b && (c - b) >= (b - a)) System.out.println(":)");
        else if(a > b && b > c && (b - c) < (a - b)) System.out.println(":)");
        else if(a > b && b > c && (b - c) >= (a - b)) System.out.println(":(");
        else if(a == b && c > b) System.out.println(":)");
        else System.out.println(":(");
            
        
              
    }
}
