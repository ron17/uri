
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double valor;
        
        valor = tec.nextDouble();
        
        if(valor >= 0 && valor <= 400){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.15) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.15));
            System.out.println("Em percentual: 15 %");
        }
        if(valor > 400 & valor <= 800){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.12) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.12));
            System.out.println("Em percentual: 12 %");
        }
        if(valor > 800 & valor <= 1200){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.10) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.10));
            System.out.println("Em percentual: 10 %");
        }
        if(valor > 1200 & valor <= 2000){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.07) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.07));
            System.out.println("Em percentual: 7 %");
        }
        if(valor > 2000){
            System.out.printf("Novo salario: %.2f%n", ((valor * 0.04) + valor));
            System.out.printf("Reajuste ganho: %.2f%n", (valor * 0.04));
            System.out.println("Em percentual: 4 %");
        }
            
    }
}
