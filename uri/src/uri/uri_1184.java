
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1184 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        char o;
        int l=1, c=0;
        
        double m[][] = new double[12][12];
        double soma=0;
        
        do{
            o = tec.next().charAt(0);
        }while(o != 'S' && o != 'M');
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = tec.nextDouble();
                
            }
        }
        
        while(c < m.length-1){
            for (int i = l; i < m.length; i++) {
                for (int j = c; j < l; j++) {
                    soma+= m[i][j];
                }
                l++;
            }
            
            c++;
        }
        
        if(o == 'S')
            System.out.printf("%.1f%n", soma);
        else
            System.out.printf("%.1f%n", soma / 66);
    }
}
