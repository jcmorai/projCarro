package uri;

import java.util.Scanner;

/**
 * Uri902
 */
public class Uri902 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in);
        float nota;
        
        System.out.println("Digite a Nota: ");
        nota = entrada.nextFloat();

        if  (nota >= 6){
            System.out.println("Aluno APROVADO com nota " + nota);
        }
        
        entrada.close();

    }
}