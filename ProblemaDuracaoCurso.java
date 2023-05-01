// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no formato horas:minutos:segundos. 

import java.util.Scanner;

public class ProblemaDuracaoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = "Duração";
        System.out.println(titulo);
        System.out.println("Informe o tempo total:");
        int duracaoTempo = sc.nextInt();
        int horas = duracaoTempo / 3600;
        int segundosRestante = duracaoTempo % 3600;
        int minutos = segundosRestante / 60;
        int segundos = segundosRestante % 60;
        System.out.println("A duração total é: " + horas + ":" + minutos + ":" + segundos); 
            sc.close();
    }
}