// Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do círculo com três casas decimais. 
// A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟 .
// Você pode usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use diretamente o valor 3.14159. 
import java.util.Scanner;

public class ProblemaCirculoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = "Raio de um Círculo";
        System.out.println(titulo);
        double raioCirculo, areaCirculo;
        System.out.println("Informe o valor do Raio do círculo: ");
        raioCirculo = sc.nextDouble();
        areaCirculo = (Math.PI * Math.pow(raioCirculo, 2));
        System.out.printf("A Área do círculo é: %.3f", areaCirculo);
            sc.close();
    }
}