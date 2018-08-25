
package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1858 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int n, t, menor=21, resp=0, i=1;
        
        n = tec.nextInt();
	
	while(i <= n){
		t = tec.nextInt();
		if(t < menor){ menor = t; resp = i;}
		i++;
	}
	
	System.out.println(resp);
    }
}
