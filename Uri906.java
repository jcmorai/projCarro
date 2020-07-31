package uri;

import java.util.Scanner;

public class Uri906 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                float l1, l2, l3;
                
                System.out.println("Digite o Lado 1 do Triangulo: ");
                l1 = entrada.nextFloat();
        
                System.out.println("Digite o Lado 2 do Triangulo: ");
                l2 = entrada.nextFloat();

                System.out.println("Digite o Lado 3 do Triangulo: ");
                l3 = entrada.nextFloat();

                if  (l1 == l2) && (l1 == l3) && (l2 == l3){
                    System.out.println("Este Triangulo é EQUILATERO");
                } else {
                       if  (l1 == l2) || (l1 == l3) || (l2 == l3) {
                           System.out.println("Este Triangulo é ISOSCELES");
                       } else {
                              if  (l1 > (l2+l3)){
                                   System.out.println("Não é um Triangulo");
                              } else {
                                   System.out.println("Este é um Triangulo ESCALENO");
                              }
                       }
                entrada.close();

        }
    }
}