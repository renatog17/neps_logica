package mediainteiraponderada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros A e B
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // Define os pesos para A e B
        int pesoA = 4;
        int pesoB = 6;

        // Calcula a média ponderada e obtém apenas a parte inteira
        int mediaPonderada = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        // Imprime a média ponderada (apenas a parte inteira)
        System.out.println(mediaPonderada);
	}
}
