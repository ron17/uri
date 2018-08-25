
package uri;

import java.util.Scanner;


public class uri_1097 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        int aux=0;
        for (int i = 1, j=7; i < 10;) {
            aux = j;
            for (int k = 0; k < 3; k++) {
                System.out.println("I="+i+" J="+j);
                j--;
            }
            j= aux;
            j+=2;
            i+=2;
        }
    }
}
