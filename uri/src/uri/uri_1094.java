
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int qtd, C=0, R=0, S=0, total=0;
        
        int quantia;
        char tipo;
        
        qtd = tec.nextInt();
        
        for (int i = 0; i < qtd; i++) {
            quantia = tec.nextInt();
            tipo = tec.next().charAt(0);
            
            if(tipo == 'C')
                C+=quantia;
            else if(tipo == 'R')
                R+=quantia;
            else if(tipo == 'S')
                S+=quantia;
            
            total+=quantia;
        }
        
        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+C);
        System.out.println("Total de ratos: "+R);
        System.out.println("Total de sapos: "+S);
        System.out.printf("Percentual de coelhos: %.2f %c\n", (((double)C * 100.00) / (double)total), '%');
        System.out.printf("Percentual de ratos: %.2f %c\n", (((double)R * 100.00) / (double)total), '%');
        System.out.printf("Percentual de sapos: %.2f %c\n", (((double)S * 100.00) / (double)total), '%');
    }
}
