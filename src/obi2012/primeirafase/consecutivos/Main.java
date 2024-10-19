package obi2012.primeirafase.consecutivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maiorSequencia = 1;
		Integer numeroAtual = null;
		int contAux = 0;
		
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if (numeroAtual == null) {
				numeroAtual = aux;
				contAux++;
			} else if (numeroAtual == aux) {
				contAux++;
				maiorSequencia = Math.max(maiorSequencia, contAux);
			} else if (numeroAtual != aux) {
				numeroAtual = aux;
				contAux = 1;
				maiorSequencia = Math.max(maiorSequencia, contAux);

			}

		}
		System.out.println(maiorSequencia);

	}

}
