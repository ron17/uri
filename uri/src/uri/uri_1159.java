
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1159 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int x, soma=0;
        
        do{
            x = tec.nextInt();
            soma=0;
            if(x != 0){
                for (int i = 0; i < 5; i++) {
                    if(x % 2 == 0)
                        soma+= x;
                    else{
                        x++;
                        soma+= x;
                    }
            
                    x+=2;
                }
                System.out.println(soma);
            }
            
        }while(x != 0);
    }
}
