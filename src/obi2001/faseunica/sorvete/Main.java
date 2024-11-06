package obi2001.faseunica.sorvete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o comprimento da praia e o número de sorveteiros
        int P = scanner.nextInt();
        int S = scanner.nextInt();

        // Criando um array para marcar as áreas cobertas na praia
        boolean[] praia = new boolean[P];

        // Lendo os intervalos e marcando as áreas cobertas
        for (int i = 0; i < S; i++) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            for (int j = U; j < V; j++) {
                praia[j] = true; // Marcando o trecho como coberto por um sorveteiro
            }
        }

        // Encontrando e imprimindo os intervalos contínuos cobertos
        boolean inInterval = false;
        int start = 0;
        
        for (int i = 0; i < P; i++) {
            if (praia[i] && !inInterval) {
                // Início de um novo intervalo coberto
                start = i;
                inInterval = true;
            } else if (!praia[i] && inInterval) {
                // Fim do intervalo coberto
                System.out.println(start + " " + i);
                inInterval = false;
            }
        }

        // Caso o último intervalo vá até o final da praia
        if (inInterval) {
            System.out.println(start + " " + P);
        }

        // Linha em branco no final da saída
        System.out.println();
    }
	
}

