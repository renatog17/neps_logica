package obi2016.primeirafase.tacosdebilhar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[1000010];
		int qtdTotal = 0;
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if(v[aux]==0) {
				v[aux] = 1;
				qtdTotal += 2; 
			}
			else if(v[aux]==1) v[aux] = 0;
		}
		System.out.println(qtdTotal);
	}

}
