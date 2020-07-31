package uri;

import java.util.Scanner;

/**
 * Uri905
 */
public class Uri905 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float n1, n2;
        
        System.out.println("Digite o Primeiro Numero: ");
        n1 = entrada.nextFloat();

        System.out.println("Digite o Segundo Numero: ");
        n2 = entrada.nextFloat();

        System.out.println("ORDEM NÃO CRESCENTE: ");
        
        if  (n1 > n2){
            System.out.printf("Sequencia 1: " + n1);
            System.out.printf("Sequencia 2: " + n2);
        } else {
            System.out.println("Sequencia 1: " + n2);
            System.out.println("Sequencia 2: " + n1);
        }
        entrada.close();

    }
    
}