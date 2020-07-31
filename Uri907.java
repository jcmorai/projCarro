package uri;

import java.util.Scanner;

public class Uri907 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                float sal, valmin, valp;
                
                System.out.println("Informe o Salario: ");
                sal = entrada.nextFloat();
        
                System.out.println("Informe o Valor da Prestacao: ");
                valp = entrada.nextFloat();

                entrada.close();

                valmin = sal / 3;

                if  (valp > valmin){
                    System.out.println("Emprestimo Nao Autorizado. Diminua o Valor da Prestacao.");
                } else {
                    System.out.println("Emprestimo Autorizado.");
                }
            }
}