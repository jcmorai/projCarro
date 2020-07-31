package uri;

import java.util.Scanner;

public class Uri916 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, cont, soma, qtpos;
        double media, perc1;

        n1 = 1;
        soma = 0;
        cont = 1;
        qtpos = 0;
        media = 0;
        perc1 = 0;

        while (cont <= 10) {
            System.out.println("Informe o " + cont + "º numero:  ");
            n1 = entrada.nextInt();
            if (n1 >= 0) {
                qtpos = qtpos + 1;
            } 
            soma = soma + n1;
            cont++;
        }

        entrada.close();

        System.out.println("A soma dos numeros digitados é: " + soma);
        System.out.println("A quantidade de numeros POSITIVOS é: " + qtpos);
        
        media = soma / 10;
        System.out.println("A media de numeros digitados é: " + media);
                
        perc1 = ( (double)qtpos / 10) * 100;
        System.out.println("A porcentagem de numeros POSITIVOS é: " + perc1);
    }
}