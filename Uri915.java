package uri;

import java.util.Scanner;

public class Uri915 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, cont, soma;

        n1 = 1;
        soma = 0;
        cont = 1;

        while (n1 > 0) {
            System.out.println("Informe o " + cont + "º numero:  ");
            n1 = entrada.nextInt();
            soma = soma + n1;
            cont++;
        }

        entrada.close();

        System.out.printf("A soma dos valores é: " + soma);
    }
}