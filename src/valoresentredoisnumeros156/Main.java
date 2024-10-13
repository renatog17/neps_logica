package valoresentredoisnumeros156;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ini = sc.nextInt();
		int fim = sc.nextInt();
		
		if(fim<ini) {
			int aux = fim;
			fim = ini;
			ini = aux;
		}
		for (int i = ini; i <= fim; i++) {
			System.out.print(i+" ");
		}
	}

}
