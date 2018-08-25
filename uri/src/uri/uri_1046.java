
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        
        int n1, n2;

            n1 = tec.nextInt();
            n2 = tec.nextInt();

            if (n1 == n2)
                System.out.println("O JOGO DUROU 24 HORA(S)");
            else if (n1 > n2)
                System.out.println("O JOGO DUROU " + ((24 - n1) + n2) + " HORA(S)");
            else
                System.out.println("O JOGO DUROU " + (n2 - n1) + " HORA(S)");

    }
}
