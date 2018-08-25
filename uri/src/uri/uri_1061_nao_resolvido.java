
package uri;

import java.util.Scanner;


public class uri_1061_nao_resolvido {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        String dia1, numero1, tempo1;
        String dia2, numero2, tempo2;
        
        int Dia1, hora1, minuto1, segundo1;
        int Dia2, hora2, minuto2, segundo2;
        
        dia1 = tec.next();
        numero1 = tec.nextLine();
        tempo1 = tec.nextLine();
        
        dia2 = tec.next();
        numero2 = tec.nextLine();
        tempo2 = tec.nextLine();
                
        Dia1 = Integer.parseInt(numero1.trim());
        hora1 = Integer.parseInt(String.valueOf((tempo1.charAt(0) +""+ tempo1.charAt(1))));
        minuto1 = Integer.parseInt(String.valueOf((tempo1.charAt(5) +""+ tempo1.charAt(6))));
        segundo1 = Integer.parseInt(String.valueOf((tempo1.charAt(10) +""+ tempo1.charAt(11))));
        
        Dia2 = Integer.parseInt(numero2.trim());
        hora2 = Integer.parseInt(String.valueOf((tempo1.charAt(0) +""+ tempo1.charAt(1))));
        minuto2 = Integer.parseInt(String.valueOf((tempo1.charAt(5) +""+ tempo1.charAt(6))));
        segundo2 = Integer.parseInt(String.valueOf((tempo1.charAt(10) +""+ tempo1.charAt(11))));
        
        System.out.println(((Dia2 - Dia1) - 1) + " dia(s)");
        System.out.println();
    }
}
