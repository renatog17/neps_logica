package obi2006.primeirafase.margaridas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lista[] = new int [1000000000];
		
		int c = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < c; i++) {
			lista[sc.nextInt()] = sc.nextInt();
		}
		
		
		
		for (int i = 0; i < n; i++) {
			int programa = sc.nextInt();
			int versao = sc.nextInt();
			if(lista[programa]<versao) {
				lista[programa] = versao;
			}
		}
		
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=0) {
				System.out.println(lista[i]);
			}
		}
	}

}
