
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1095 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        for (int i = 1, j = 60; j >= 0; j-=5, i+=3) {
            System.out.println("I="+i+" J="+j);
        }
    }
}
