package obi2007.primeirafase.quadradomagico;

import java.util.Scanner;

public class Main {

	 public static int ehQuadradoMagico(int[][] matriz, int N) {
	        // Soma da primeira linha como referência
	        int somaEsperada = 0;
	        for (int j = 0; j < N; j++) {
	            somaEsperada += matriz[0][j];
	        }

	        // Verificar as somas das linhas
	        for (int i = 1; i < N; i++) {
	            int somaLinha = 0;
	            for (int j = 0; j < N; j++) {
	                somaLinha += matriz[i][j];
	            }
	            if (somaLinha != somaEsperada) {
	                return -1;
	            }
	        }

	        // Verificar as somas das colunas
	        for (int j = 0; j < N; j++) {
	            int somaColuna = 0;
	            for (int i = 0; i < N; i++) {
	                somaColuna += matriz[i][j];
	            }
	            if (somaColuna != somaEsperada) {
	                return -1;
	            }
	        }

	        // Verificar a soma da diagonal principal
	        int somaDiagonalPrincipal = 0;
	        for (int i = 0; i < N; i++) {
	            somaDiagonalPrincipal += matriz[i][i];
	        }
	        if (somaDiagonalPrincipal != somaEsperada) {
	            return -1;
	        }

	        // Verificar a soma da diagonal secundária
	        int somaDiagonalSecundaria = 0;
	        for (int i = 0; i < N; i++) {
	            somaDiagonalSecundaria += matriz[i][N - i - 1];
	        }
	        if (somaDiagonalSecundaria != somaEsperada) {
	            return -1;
	        }

	        // Se todas as somas forem iguais, retornar a soma esperada
	        return somaEsperada;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Leitura da entrada
	        int N = scanner.nextInt();  // Tamanho do quadrado
	        int[][] matriz = new int[N][N];
	        
	        // Preenchendo a matriz
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Chamar a função para verificar se é um quadrado mágico
	        int resultado = ehQuadradoMagico(matriz, N);
	        
	        // Imprimir o resultado
	        System.out.println(resultado);
	        
	        scanner.close();
	    }

}
