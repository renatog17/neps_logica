package obi2023.primeirafase.chinelos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int chinelos[] = new int[501];
		for (int i = 1; i <= n; i++) {
			chinelos[i] = sc.nextInt();
		}
		n = sc.nextInt();
		int cont = 0;
		for (int i = 1; i <= n; i++) {
			int aux = sc.nextInt();
			if(chinelos[aux]>0) {
				cont++;
				chinelos[aux]--;
			}
		}
		System.out.println(cont);
	}

}
