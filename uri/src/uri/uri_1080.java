
package uri;

import java.util.Scanner;


public class uri_1080 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int n[] = new int[100];
        int aux=0, aux2=0;
        
        for (int i = 0; i < n.length; i++) {
            n[i] = tec.nextInt();
            if(n[i] > aux){
                aux = n[i];
                aux2 = i;
            }
        }
        aux2++;
        System.out.println(aux);
        System.out.println(aux2);
    }
   
}
