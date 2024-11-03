package obi2020.primeirafase.b.camisetasdaolimpiada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c1 = 0, c2 = 0;
		for (int i = 0; i < n; i++) {
			if(sc.nextInt()==1) c1++;
			else c2++;
		}
		if(sc.nextInt()==c1 && sc.nextInt()==c2) System.out.println("S");
		else System.out.println("N");
	}

}
