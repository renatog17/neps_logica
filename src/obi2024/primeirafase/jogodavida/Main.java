package obi2024.primeirafase.jogodavida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int iteracoes = sc.nextInt();
		int m[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			String linha = sc.next();
			for (int j = 0; j < n; j++) {
				m[i][j] = Character.getNumericValue(linha.charAt(j));
			}
		}

		for (int i = 0; i < iteracoes; i++) {
			int novoEstado [][] = new int[n][n];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					int contCelulasVivas = 0;
					for (int x = -1; x <= 1; x++) {
						for (int y = -1; y <= 1; y++) {
							if (x == 0 && y == 0) continue;
							
							int vizinhoX = j + x;
							int vizinhoY = k + y;
							
							if (vizinhoX >= 0 && vizinhoX < n && vizinhoY >= 0 && vizinhoY < n) {
                                
								contCelulasVivas += m[vizinhoX][vizinhoY];
                            }
						}
					}
					
					if(m[j][k]==0) {
						if(contCelulasVivas==3) {
							novoEstado[j][k] = 1;
						}else {
							novoEstado[j][k] = 0;
						}
					}else {
						if(contCelulasVivas<2 || contCelulasVivas>3) {
							novoEstado[j][k] = 0;
						}else {
							novoEstado[j][k] = 1;
						}
						
					}
					
				}
			}
//			for (int x = 0; x < n; x++) {
//	            for (int z = 0; z < n; z++) {
//	                System.out.print(novoEstado[x][z]);
//	            }
//	            System.out.println();
//	        }
//			System.out.println("---");
			m = novoEstado;
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
	}

}
