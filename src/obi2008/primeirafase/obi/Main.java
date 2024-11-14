package obi2008.primeirafase.obi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if(sc.nextInt() + sc.nextInt() >= p)
				cont++;
		}
		System.out.println(cont);
	}
}
