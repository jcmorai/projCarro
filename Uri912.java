package uri;

import java.util.Scanner;

public class Uri912 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                int n1, cont;
                
                System.out.println("Informe um Numero: ");
                n1 = entrada.nextInt();

                entrada.close();
        
                if  (n1 < 0) {
                    System.out.println("Numero Invalido");
                } else {
                    cont = 0;
                    while (cont <= 10) {
                        System.out.println(n1 + " x " + cont + " = " + (n1*cont));
                        cont++;
                    }
                    
                }
        
        System.out.println("Fim do Programa");

            }
}