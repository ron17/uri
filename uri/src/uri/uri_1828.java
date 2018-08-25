
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1828 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner tec = new Scanner(System.in);
        
        int t;
        String a, b;
        
        do{
            t = tec.nextInt();
        }while(t > 100);
        
        
        for (int i = 0; i < t; i++) {
            
            a = tec.next();
            b = tec.next();
            if(a.equals(b)) System.out.println("Caso #" + ( i + 1 ) +": De novo!");
            else if(a.equals("tesoura") && b.equals("papel"))System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
                
            else if(a.equals("papel") && b.equals("pedra"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("pedra") && b.equals("lagarto"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("lagarto") && b.equals("Spock"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("Spock") && b.equals("tesoura"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("tesoura") && b.equals("lagarto"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("lagarto") && b.equals("papel"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("papel") && b.equals("Spock"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("Spock") && b.equals("pedra"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else if(a.equals("pedra") && b.equals("tesoura"))
                System.out.println("Caso #" + ( i + 1 ) +": Bazinga!");
            else
                System.out.println("Caso #" + ( i + 1 ) +": Raj trapaceou!");
                    
        }
    }
}
