
package uri;

import java.util.Locale;
import java.util.Scanner;


public class uri_1957 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int v;
        char hexa[] = new char[20];
        
        v = tec.nextInt();
        
        int i=0, mod;
        while(v>0)
        {
            mod = v % 16;
            v /= 16;
            if(mod<=9)
                hexa[i] = (char)(mod + 48);
            else if(mod==10)
                hexa[i] = 'A';
            else if(mod==11)
                hexa[i] = 'B';
            else if(mod==12)
                hexa[i] = 'C';
            else if(mod==13)
                hexa[i] = 'D';
            else if(mod==14)
                hexa[i] = 'E';
            else if(mod==15)
                hexa[i] = 'F';
            i++;
        }
        
        
        for (int k = hexa.length-1; k >= 0; k--){
            System.out.print(hexa[k]);
        }
        System.out.println();
        
    }
}
