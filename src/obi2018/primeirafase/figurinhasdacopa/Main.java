package obi2018.primeirafase.figurinhasdacopa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();
		boolean figurinhas[] = new boolean[110];
		
		
		for (int i = 0; i < c; i++) {
			figurinhas[sc.nextInt()] = true;
		}
		
		int cont = 0;
		for (int i = 1; i <= m; i++) {
			int aux = sc.nextInt();
			if (figurinhas[aux] == true) {
				figurinhas[aux] = false;
				cont++;
			}
		}
		System.out.println(c-cont);
	}

}
