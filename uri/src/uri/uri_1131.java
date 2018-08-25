
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1131 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int inter, gremio, x;
        int intwin=0, grewin=0, draw=0, grenais=1;
        
        do{
            inter = tec.nextInt();
            gremio = tec.nextInt();
            
            if(inter > gremio)
                intwin++;
            else if(gremio > inter)
                grewin++;
            else
                draw++;
            
            System.out.println("Novo grenal (1-sim 2-nao)");
            x = tec.nextInt();
            
            if(x != 2)
                grenais++;
        }while(x != 2);
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + intwin);
        System.out.println("Gremio:" + grewin);
        System.out.println("Empates:" + draw);
        if(intwin > grewin)
            System.out.println("Inter venceu mais");
        else if(grewin > intwin)
            System.out.println("Gremio venceu mais");                    
        else 
            System.out.println("Nao houve vencedor");
    }
}
