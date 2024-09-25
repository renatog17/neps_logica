package SomaDosElementos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int somador = 0;
		for (int i = 0; i < n; i++) {
			somador = somador+sc.nextInt();
		}
		System.out.println(somador);
	}

}
