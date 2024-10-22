package obi2011.primeirafase.corrida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		int menorTempo = 100000100;
		int c = 0;
		
		for (int i = 0; i < n; i++) {
			int aux = 0;
			int j = 0;
			while( j < v) {
				j++;
				aux += sc.nextInt();
			}
			if(aux<menorTempo) {
				c = i;
				menorTempo = aux;
			}
		}
		System.out.println(c+1);
	}

}
