// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes números. 

import java.util.Scanner;

public class ProblemaSomaCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorUm, valorDois, somaValores;
        String titulo = "Programa Soma";
        System.out.println(titulo);
        System.out.println("Informe o primeiro número:");
        valorUm = sc.nextInt();
        System.out.println("Informe o segundo número:");
        valorDois = sc.nextInt();
        somaValores = valorUm + valorDois;
        System.out.println("A soma é: " + somaValores);
        sc.close();
    }
    
}
