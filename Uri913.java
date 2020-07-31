package uri;

import java.util.Scanner;

public class Uri913 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, cont;

        System.out.println("Informe um Numero: ");
        n1 = entrada.nextInt();

        entrada.close();

        if (n1 <= 0) {
            System.out.println("Numero Invalido");
        } else {
            cont = 1;
            while (cont <= n1) {
                System.out.print(cont + ", ");
                cont = cont * 2;
            }
        }
        System.out.println("Fim do Programa");

    }
}