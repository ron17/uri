package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1149 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        int n, a, soma = 0;

        a = tec.nextInt();
        n = tec.nextInt();

        while (n <= 0) {
            n = tec.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            soma += a;
            a++;
        }

        System.out.println(soma);

    }
}
