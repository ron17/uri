
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        double A, B, C, DELTA, R1, R2;
        
        A = tec.nextDouble();
        B = tec.nextDouble();
        C = tec.nextDouble();
        
        DELTA = Math.pow(B, 2) - 4 * A * C;
        if(DELTA < 0)
            System.out.println("Impossivel calcular");
        else if(DELTA == 0){
            System.out.println("Impossivel calcular");
        }else{
            if(String.valueOf(((-B) + (Math.sqrt(DELTA))) / (2 * A)) == "NaN" || String.valueOf(((-B) + (Math.sqrt(DELTA))) / (2 * A)) == "-Infinity")
                System.out.println("Impossivel calcular");
            else{
                System.out.printf("R1 = %.5f%n", ((-B) + (Math.sqrt(DELTA))) / (2 * A));
                System.out.printf("R2 = %.5f%n", ((-B) - (Math.sqrt(DELTA))) / (2 * A));
                }
        }
    }
}
