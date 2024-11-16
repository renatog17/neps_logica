package obi2022.terceirafase.caravana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		int numeros[] = new int[n];
		for (int i = 0; i < numeros.length; i++) {
			int aux = sc.nextInt();
			soma += aux;
			numeros[i] = aux;
		}
		
		int c = soma/n;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(c-numeros[i]);
		}
	}

}
