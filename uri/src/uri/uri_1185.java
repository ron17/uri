
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1185 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        char o;
        int l=0, c;
        double soma=0;
        double m[][] = new double[3][3];
        
        do{
            o = tec.next().charAt(0);
        }while(o != 'S' && o != 'M');
        
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = tec.nextDouble();
            }
        }
        
        c= m.length-2;
        
        for (int i = 0; i < m.length-1; i++) {
            for (int j = c; j >= 0; j--) {
                soma+= m[i][j];
                
            }
            c--;
        }
        
        if(o == 'S')
            System.out.printf("%.1f%n",soma);
        else
            System.out.printf("%.1f%n", soma / 3);
        
        
        
        
    }
}
