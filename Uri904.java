package uri;

import java.util.Scanner;

/**
 * Uri904
 */
public class Uri904 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in);
        float n1, n2;
        double media;

        System.out.println("Digite a Nota1: ");
        n1 = entrada.nextFloat();

        System.out.println("Digite a Nota2: ");
        n2 = entrada.nextFloat();

        media = (n1 + n2) / 2;

        if  (media >=6){
            System.out.println("Aluno APROVADO com Media " + media);
        } else {
            System.out.println("Aluno REPROVADO com media " + media);
        }
        
        entrada.close();

    }
}