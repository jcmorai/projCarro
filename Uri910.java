package uri;

import java.util.Scanner;

public class Uri910 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                double n1, n2, n3, n4, qtfaltas, media, exame;
                
                System.out.println("Informe Nota 1: ");
                n1 = entrada.nextDouble();
        
                System.out.println("Informe Nota 2: ");
                n2 = entrada.nextDouble();

                System.out.println("Informe Nota 3: ");
                n3 = entrada.nextDouble();

                System.out.println("Informe Nota 4: ");
                n4 = entrada.nextDouble();

                System.out.println("Informe Qt. Faltas: ");
                qtfaltas = entrada.nextDouble();

                media = (n1 + n2 + n3 + n4) / 4;

                if  (qtfaltas > 16) {
                    System.out.println("Aluno REPROVADO por FALTAS");
                } else {
                       if  (media >= 6) {
                           System.out.println("Aluno APROVADO");
                       } else {
                              System.out.println("Informe a Nota do EXAME: ");
                              exame = entrada.nextDouble();
                              if  ((media + exame) /2 >= 5) {
                                  System.out.println("Aluno APROVADO apos EXAME FINAL");
                              } else {
                                  System.out.println("Aluno REPROVADO apos EXAME FINAL");
                               }
                            }                        
                }

                entrada.close();

            }
}