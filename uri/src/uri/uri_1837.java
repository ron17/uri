
package uri;

import java.util.Locale;
import java.util.Scanner;

public class uri_1837 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        int a,b,c,d,e,f=0,q,r;
        a = tec.nextInt();
        b = tec.nextInt();
    if(a<0)
    {
        e=b;
        if(b<0) e=b*-1;
        for(r=0; r<e; r++)
        {
            f=a-r;
            if(f%b==0) break;
        }
        q=f/b;
    }
    else
    {
        q=a/b;
        r=a%b;
    }
    System.out.printf("%d %d\n",q,r);
    }
}
