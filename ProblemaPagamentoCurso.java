// Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). 
// Ao final, mostrar o valor do pagamento do funcionário com uma mensagem explicativa, conforme exemplo. 

import java.util.Scanner;

public class ProblemaPagamentoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = "Pagamento";
        System.out.println(titulo);
        System.out.println("Digite o seu nome: ");
        String nomeFuncionario = sc.nextLine();
        System.out.println("Informe o valor recebido por hora: ");
        float valorHora = sc.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        float horasTrabalhadas = sc.nextFloat();
        float valorPagamento = (valorHora * horasTrabalhadas);
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Valor por Hora: " + valorHora);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.println("O Pagamento de " + nomeFuncionario + " deve ser R$ " + valorPagamento);
            sc.close();
    }
}