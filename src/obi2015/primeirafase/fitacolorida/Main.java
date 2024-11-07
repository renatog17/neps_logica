package obi2015.primeirafase.fitacolorida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int [n];
		
		for (int i = 0; i < v.length; i++) {
			int aux = sc.nextInt();
			int anterior = 0;
			if(aux==0) {
				if(anterior==0) {
					v[0] = aux;
				}else {
					
				}
				anterior = aux;
				
			}
		}

	}

}
