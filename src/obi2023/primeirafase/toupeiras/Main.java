package obi2023.primeirafase.toupeiras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), t = sc.nextInt();
		boolean[][] adj = new boolean[s + 1][s + 1];
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a][b] = true;
			adj[b][a] = true;
		}
		int p = sc.nextInt();
		int saida = p;
		boolean ok = true;
		for (int i = 0; i < p; i++) {
			int noAnterior = -1;
			int no;
			int h = sc.nextInt();
			for (int j = 0; j < h; j++) {
				no = sc.nextInt();
				if (noAnterior == -1) {
					noAnterior = no;
					continue;
				}
				if (!adj[no][noAnterior]) {
					ok = false;
				}
				noAnterior = no;
			}
			if(!ok) {
				saida--;
				ok = true;
			}
		}
		System.out.println(saida);
	}
}
