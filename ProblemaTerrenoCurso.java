import java.util.Scanner;

public class ProblemaTerrenoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double larguraTerreno, comprimentoTerreno, areaDoTerreno, valorMetroQuadrado, precoTerreno;
        String titulo = ("Solução Problema Terreno");
        System.out.println(titulo);
        System.out.println("Digite a largura do terreno: ");
        larguraTerreno = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimentoTerreno = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        valorMetroQuadrado = sc.nextDouble();
        areaDoTerreno = larguraTerreno * comprimentoTerreno;
        System.out.println("A área do terreno é: " + areaDoTerreno + " m2.");
        precoTerreno = areaDoTerreno * valorMetroQuadrado;
        System.out.printf("O preço do terreno é: R$ %.2f", precoTerreno);
            sc.close();
    }
}