// Problema "medidas" 
// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados com quatro casas decimais): 
// a) a área do quadrado que tem lado A 
// b) a área do triângulo retângulo que base A e altura B 
// c) a área do trapézio que tem bases A e B, e altura C

import java.util.Scanner;

public class ProblemaMedidasCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = "Medidas";
        System.out.println(titulo);
        float medidaA, medidaB, medidaC, areaQuadrado, areaTriangulo, areaTrapezio;
        System.out.println("Informe a medida A: ");
        medidaA = sc.nextFloat();
        System.out.println("Informe a medida B: ");
        medidaB = sc.nextFloat();
        System.out.println("Informe a medida C: ");
        medidaC = sc.nextFloat();
        areaQuadrado = (medidaA * medidaA);
        areaTriangulo = (medidaA * medidaB) / 2;
        areaTrapezio = ( medidaA + medidaB) / 2 * medidaC;
        System.out.printf("\nA Área do Quadrado é: %.4f" , areaQuadrado);
        System.out.printf("\nA Área do Triângulo é: %.4f" , areaTriangulo);
        System.out.printf("\nA Área do Trapézio é: %.4f" , areaTrapezio);
            sc.close();
    }
}