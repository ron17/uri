
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1187 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        char o;
        int Ci=1, Cf= 11;
        
        double m[][] = new double [12][12];
        double soma=0;
        
        do{
            o = tec.next().charAt(0);
        }while(o != 'S' && o != 'M');
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = tec.nextDouble();
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = Ci; j < Cf; j++) {
                soma += m[i][j];
                
            }
            Ci++;
            Cf--;
        }
        
        //30
                
        if(o == 'S')
            System.out.printf("%.1f%n" , soma);
        else
            System.out.printf("%.1f%n", soma / 30.0);
    }
}
