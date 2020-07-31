package uri;

import java.util.Scanner;

public class Uri909 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                double salario;
                
                System.out.println("Informe o Salario: ");
                salario = entrada.nextDouble();
        
                entrada.close();

                if  (salario <= 600) {
                    System.out.println("Isento do Desconto do INSS");
                } else {
                       if  (salario > 600 && salario <= 1200) {
                           System.out.println("O desconto do INSS sera de 20%: " + salario * 0.20);
                       } else {
                              if  (salario > 1200 && salario <= 2000) {
                                  System.out.println("O desconto do INSS sera de 25%: " + salario * 0.25);
                              } else {
                                   System.out.println("O desconto do INSS sera de 30%: " + salario * 0.30);
                               }
                            }                        
                }
            }
}