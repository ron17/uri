
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1096 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 7; j >= 5 ; j--) {
                System.out.println("I="+i+" J="+j);
            }
        }
    }
}
