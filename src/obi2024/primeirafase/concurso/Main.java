package obi2024.primeirafase.concurso;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int notas [] = new int[n];
		for (int i = 0; i < n; i++) {
			notas[i] = sc.nextInt();
		}
		
		Arrays.sort(notas);
		
		System.out.println(notas[n-k]);
	}

}
