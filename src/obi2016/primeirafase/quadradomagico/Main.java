package obi2016.primeirafase.quadradomagico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m[][] = new int[n][n];
		int lZero = 0;
		int cZero = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int aux = sc.nextInt();
				if(aux == 0) {
					lZero = i;
					cZero = j;
				}
				m[i][j] = aux;
				
			}
		}

		int somasLinha[] = new int[n];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				somasLinha[i] += m[i][j];
			}
		}

		int somasColuna[] = new int[n];
		for (int i = 0; i < m.length; i++) {
			int j = 0;
			for (j = 0; j < m.length; j++) {
				somasColuna[j] += m[i][j];
			}
		}

		int somaDiagonalPrincial = 0;

		for (int i = 0; i < m.length; i++) {
			somaDiagonalPrincial += m[i][i];
		}

		int somaDiagonalSecundaria = 0;
		int j = m.length - 1;
		for (int i = 0; i < m.length; i++) {
			somaDiagonalSecundaria += m[i][j];
			j--;
		}
		
		int z = 0;
		int x = 0;
		if(lZero!=cZero) {
		z = Math.max(somaDiagonalSecundaria, Math.max(somaDiagonalPrincial, Math.max(somasLinha[lZero], somasColuna[cZero])));
		x = Math.min(somaDiagonalSecundaria, Math.min(somaDiagonalPrincial, Math.min(somasLinha[lZero], somasColuna[cZero])));
		}else {
		z = Math.max(somaDiagonalSecundaria, Math.max(somaDiagonalPrincial, Math.max(somasLinha[0], somasColuna[0])));
		x = Math.min(somaDiagonalSecundaria, Math.min(somaDiagonalPrincial, Math.min(somasLinha[0], somasColuna[0])));
		}
			System.out.println(z-x);
			System.out.println(lZero+1);
			System.out.println(cZero+1);
		
	}

}
