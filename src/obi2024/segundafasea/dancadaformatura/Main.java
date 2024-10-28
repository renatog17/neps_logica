package obi2024.segundafasea.dancadaformatura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int matriz[][] = new int[n][m];
		
		int cont = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matriz[i][j] = cont;
				cont++;
			}	
		}
		
		for (int i = 0; i < p; i++) {
			String c = sc.next();
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(c.equals("C")) {
				int aux;
				for (int j = 0; j < n; j++) {
					aux = matriz[j][a];
					matriz[j][a] = matriz[j][b];
					matriz[j][b] = aux;
				}
			}else {
				int aux;
				for (int j = 0; j < m; j++) {
					aux = matriz[a][j];
					matriz[a][j] = matriz[b][j];
					matriz[b][j] = aux;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matriz[i][j]+" ");
			}	
			System.out.println();
		}
	}

}
