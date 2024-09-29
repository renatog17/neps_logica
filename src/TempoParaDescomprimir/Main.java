package TempoParaDescomprimir;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Leitura do número de linhas
		int L = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha após o número

		String saida = "";

		// Processamento de cada linha
		for (int i = 0; i < L; i++) {
			int N = scanner.nextInt(); // Número de vezes que o caractere será repetido
			char symbol = scanner.next().charAt(0); // O caractere que será repetido

			// Imprimindo o caractere N vezes
			for (int j = 0; j < N; j++) {
				saida = saida+symbol;
			}
			saida = saida + "\n";
		}
		System.out.println(saida);
		scanner.close();
	}

}
