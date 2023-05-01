    // Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). 
// Seu programa deve mostrar o valor do troco a ser devolvido ao cliente. 

import java.util.Scanner;

public class ProblemaTrocoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float precoProduto, unidadesCompradas, valorPago, valorTroco;
        String titulo = "Problema Troco";
        System.out.println(titulo);
        System.out.println("Informe o preço unitário do produto: ");
        precoProduto = sc.nextFloat();
        System.out.println("Informe a quantidade de unidades compradas do produto: ");
        unidadesCompradas = sc.nextFloat();
        System.out.println("Informe o valor Pago: ");
        valorPago = sc.nextFloat();
        valorTroco = (valorPago - (precoProduto * unidadesCompradas));
        System.out.printf("O troco é: R$ R$ %.2f", valorTroco);
            sc.close();
    }
}
