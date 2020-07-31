package uri;

import java.util.Scanner;

public class Uri908 {

    public static void main(String[] args) {
     
                Scanner entrada = new Scanner(System.in);
                String senha;
                
                System.out.println("Informe a Senha: ");
                senha = entrada.nextLine();
        
                entrada.close();

                if  (senha.equals("R10p5")) {
                    System.out.println("Acesso CONCEDIDO");
                } else {
                    System.out.println("Acesso NEGADO");
                }
            }
}