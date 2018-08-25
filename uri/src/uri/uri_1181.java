
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1181 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int l = 0;
        double m [][] = new double [12][12];
        char t;
        double soma=0;
        
        do{
            l = tec.nextInt();
        }while(l < 0 || l > 11);
        
        do{
            t = tec.next().charAt(0);
        }while(t != 'S' && t != 'M');
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = tec.nextDouble();
            }
        }
        
        for (int i = 0; i < m.length; i++) {
            soma += m[l][i];
        }
        
        if(t == 'M')
            System.out.printf("%.1f%n", (soma / m.length));
        else
            System.out.printf("%.1f%n", soma);
        
        
        
    }
}
