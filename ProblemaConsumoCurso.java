// Problema "consumo" 
// Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de combustível gasto por este carro ao percorrer tal distância. 
// Seu programa deve mostrar o consumo médio do carro, com três casas decimais. 

import java.util.Scanner;

public class ProblemaConsumoCurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = "Consumo de Combustível";
        System.out.println(titulo);       
        System.out.println("Informe a distancia total em KM: ");
        float distanciaTotal = sc.nextFloat();
        System.out.println("Informe o total de combustível gasto: ");
        float totalCombustivel = sc.nextFloat();
        float consumoMedio = (distanciaTotal / totalCombustivel);
        System.out.printf("O consumo médio do carro é: %.3f", consumoMedio);
            sc.close();
    }
}

    
