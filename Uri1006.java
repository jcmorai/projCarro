package uri;

import java.util.Scanner;

/**
 * Uri1006
 */
public class Uri1006 {

    public static void main(String[] args) {
    
// entrada de dados - TECLADO

    Scanner entrada = new Scanner(System.in);

    float n1, n2, n3, media;
           
    n1 = entrada.nextFloat();
    n2 = entrada.nextFloat();
    n3 = entrada.nextFloat();
    media = (n1 * 2 + n2 * 3 + n3 * 5) / 10; 
        
    System.out.println("MEDIA = %.1f\n" + media);
        
    entrada.close();

    }
}