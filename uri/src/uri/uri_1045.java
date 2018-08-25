
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double a, b, c, aux;
        
        do{
        a = tec.nextDouble();
        b = tec.nextDouble();
        c = tec.nextDouble();
        }while(a <= 0 || b <= 0 || c <= 0);
        
        
        
        if(b >= c && b >= a && a >= c){
            aux = a;
            a = b;
            b = aux;
        }
        if(b >= c && b >= a && c >= a){
            aux = a;
            a = b;
            b = c;
            c = aux;
        }
        
        if(c >= b && c >= a && b >= a){
            aux = a;
            a = c;
            c = aux;
        }
        
        if(c >= b && c >= a && a >= b){
            aux = a;
            a = c;
            c = b;
            b = aux;
        }
        
        if(a >= b && a >= c && c >= b){
            aux = b;
            b = c;
            c = aux;      
        }
        
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        
        if(a >= (b+c)) System.out.println("NAO FORMA TRIANGULO");
        else{
        if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) System.out.println("TRIANGULO RETANGULO");
        else if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) System.out.println("TRIANGULO OBTUSANGULO");
        else if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) System.out.println("TRIANGULO ACUTANGULO");
        if(a == b && b == c) System.out.println("TRIANGULO EQUILATERO");
        else if(a == b || c == a || b == c)System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
