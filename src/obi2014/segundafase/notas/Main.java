package obi2014.segundafase.notas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int notas[] = new int[110];
		for (int i = 0; i < n; i++) {
			notas[sc.nextInt()]++;
		}
		
		int maisVezesRepetido = 0;
		int saida = 0;
		for (int i = 1; i < 101; i++) {
			if(notas[i]>=maisVezesRepetido) {
				maisVezesRepetido = notas[i];
				saida = i;
			}
		}
		System.out.println(saida);
	}

}
