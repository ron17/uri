
package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1186 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        char o;
        
        double soma=0;
        double m[][] = new double[12][12];
        
        do{
            o = tec.next().charAt(0);
        }while(o != 'S' && o != 'M');
        
        
            for(int i = 0; i < 12; i++){
                for(int j = 0; j < 12; j++){
                    m[i][j] = tec.nextDouble();
                   if(j > 11 - i){
                        soma += m[i][j];
                   }
            }
   }
        
        if(o == 'S')
            System.out.printf("%.1f%n",soma);
        else
            System.out.printf("%.1f%n", soma / 66.0);
        
        
        
        
    }
}
