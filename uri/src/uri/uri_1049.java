
package uri;

import java.util.Scanner;
import java.util.Locale;

public class uri_1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        String p1,p2,p3;
        
        p1 = tec.nextLine();
        p2 = tec.nextLine();
        p3 = tec.nextLine();
        
        if(p1.equals("vertebrado")){
            
            if(p2.equals("ave")){
                
                if(p3.equals("carnivoro"))
                    System.out.println("aguia");
                
                if(p3.equals("onivoro"))
                    System.out.println("pomba");
            }
            
            if(p2.equals("mamifero")){
                
                if(p3.equals("onivoro"))
                    System.out.println("homem");
                
                if(p3.equals("herbivoro"))
                    System.out.println("vaca");
            }
        }
        
        else if(p1.equals("invertebrado")){
            
            if(p2.equals("inseto")){
                
                if(p3.equals("hematofago"))
                    System.out.println("pulga");
                
                if(p3.equals("herbivoro"))
                    System.out.println("lagarta");
                
            }
            
            if(p2.equals("anelideo")){
                
                if(p3.equals("hematofago"))
                    System.out.println("sanguessuga");
                
                if(p3.equals("onivoro"))
                        System.out.println("minhoca");
                
            }
        }
    }
}
