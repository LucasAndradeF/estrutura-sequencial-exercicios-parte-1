// Problema Idades 
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa decimal.
import java.util.Scanner;

public class ProblemaIdadesCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomePessoaUm, nomePessoaDois;
        double idadePessoaUm, idadePessoaDois, mediaAritmetica;
        String titulo = ("\nDados da Primeira Pessoa");
        System.out.println(titulo);
        System.out.println("Informe seu nome: ");
        nomePessoaUm = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idadePessoaUm = sc.nextInt();
        sc.nextLine();
        String dadosSegundaPessoa = ("\nDados da Segunda Pessoa");
        System.out.println(dadosSegundaPessoa);
        System.out.println("Informe seu nome completo: ");
        nomePessoaDois = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idadePessoaDois = sc.nextInt();
        mediaAritmetica = ((idadePessoaUm + idadePessoaDois) / 2);
        System.out.println("\nA idade média de " + nomePessoaUm + " e " + nomePessoaDois + " é de " + mediaAritmetica + " anos.");
            sc.close();
    }
}
