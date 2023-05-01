// Problema "retangulo" 
// Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. 
import java.util.Scanner;

public class ProblemaRetanguloCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseRetangulo, alturaRetangulo, areaRetangulo, perimetroRetangulo, diagonalRetangulo;
        String titulo = ("Solução Problema Retangulo");
        System.out.println(titulo);
        System.out.println("Digite a base do retangulo");
        baseRetangulo = sc.nextDouble();
        System.out.println("Digite a altura do retangulo");
        alturaRetangulo = sc.nextDouble();
        areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("\nA área do retangulo é: %.4f" , areaRetangulo);
        perimetroRetangulo = (baseRetangulo * 2) + (alturaRetangulo * 2);
        System.out.printf("\nO perimetro retangulo é: %.4f" , perimetroRetangulo);
        diagonalRetangulo = Math.sqrt((Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2)));
        System.out.printf("\nA diagonal do retangulo é: %.4f", diagonalRetangulo );
            sc.close();
    }
}