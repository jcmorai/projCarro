package uri;

import java.util.Scanner;

public class AppLivro {

public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String titulo;
        
    System.out.println("Informe o Titulo do Livro 1: ");
    titulo = entrada.nextLine();
    Livro livro1 = new Livro(titulo, "LTC", "Deitel", 100);

    System.out.println("Informe o Titulo do Livro 2: ");
    titulo = entrada.nextLine();
    Livro livro2 = new Livro(titulo, "Alta Books", "Joseca", 688);

    livro1.emprestar();

    entrada.close();

    boolean possoEmprestar = livro1.estaDisponivel();
    
    if (possoEmprestar) { 
        System.out.println("O livro " + livro1.titulo + " está disponível"); 
    } else { 
        System.out.println("O livro " + livro1.titulo + " não está disponível"); 
    } 

    if (livro2.estaDisponivel()) { 
        System.out.println("O livro " + livro2.titulo + " está disponível"); 
    } else { 
        System.out.println("O livro " + livro2.titulo + " não está disponível"); 
    } 

    System.out.println("Livros Cadastrados");
    livro1.exibirDados();
    livro2.exibirDados();

    System.out.println(livro1.getDados());
    System.out.println(livro2.getDados());
    
    System.out.println("Número de páginas dos livros"); 
    System.out.println(livro1.titulo + " - " + livro1.obterPaginas() + " páginas."); 
    System.out.println(livro2.titulo + " - " + livro2.obterPaginas() + " páginas."); 
    
}

}
