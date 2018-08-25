
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1018 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int valor, valor_nota;
        
        do{
            valor = tec.nextInt();
        }while(valor < 0 || valor > 1000000);
        
        valor_nota = valor;
        
        System.out.println(valor);
        
        if(valor/100 > 0){
            valor_nota = valor / 100;
            valor = valor%100;
            
            System.out.println(valor_nota+" nota(s) de R$ 100,00");
        }else System.out.println("0 nota(s) de R$ 100,00");
        
        if(valor/50 > 0){
            valor_nota = valor / 50;
            valor = valor%50;
            
            System.out.println(valor_nota+" nota(s) de R$ 50,00");
        }else System.out.println("0 nota(s) de R$ 50,00");
        
        if(valor/20 > 0){
            valor_nota = valor / 20;
            valor = valor%20;
            
            System.out.println(valor_nota+" nota(s) de R$ 20,00");
        }else System.out.println("0 nota(s) de R$ 20,00");
        
        if(valor/10 > 0){
            valor_nota = valor / 10;
            valor = valor%10;
            
            System.out.println(valor_nota+" nota(s) de R$ 10,00");
        }else System.out.println("0 nota(s) de R$ 10,00");
        
        if(valor/5 > 0){
            valor_nota = valor / 5;
            valor = valor%5;
            
            System.out.println(valor_nota+" nota(s) de R$ 5,00");
        }else System.out.println("0 nota(s) de R$ 5,00");
        
        if(valor/2 > 0){
            valor_nota = valor / 2;
            valor = valor%2;
            
            System.out.println(valor_nota+" nota(s) de R$ 2,00");
        }else System.out.println("0 nota(s) de R$ 2,00");
        
        if(valor/1 > 0){
            valor_nota = valor / 1;
            valor = valor%1;
            
            System.out.println(valor_nota+" nota(s) de R$ 1,00");
        }else System.out.println("0 nota(s) de R$ 1,00");
     }
    
}
