package obi2023.primeirafase.estoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int estoque [][] = new int[m+1][n+1];
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				estoque[i][j] = sc.nextInt();
			}
		}
		
		int p = sc.nextInt();
		int realizados = 0;
		for (int i = 0; i < p; i++) {
			int mTemp = sc.nextInt();
			int nTemp = sc.nextInt();
			if(estoque[mTemp][nTemp]>0) {
				realizados++;
				estoque[mTemp][nTemp]--;
			}
		}
		System.out.println(realizados);
		
	}
}
