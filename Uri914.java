package uri;

import java.util.Scanner;

public class Uri914 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, cont, numpar, numimpar;

        cont = 1;
        numpar = 0;
        numimpar = 0;

        while (cont <= 10) {
            System.out.println("Informe um Numero (" + cont + "/10): ");
            n1 = entrada.nextInt();
            if (n1 <= 0) {
                System.out.println("Programa CANCELADO por conter NUMEROS INVALIDOS");
                cont = 11;
            } else {
                   if (n1 % 2 == 0) {
                    numpar = numpar + 1;
                } else {
                    numimpar = numimpar + 1;
                }
            cont++;
            }
        }

        entrada.close();
       
        System.out.printf("Contamos %d par(es) e %d impar(res). \n", numpar, numimpar);
    }
}