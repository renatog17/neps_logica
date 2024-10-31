package obi2021.primeirafase.planodeinternet;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int saldo = n;
		
		for (int i = 0; i < q; i++) {
			saldo += n - sc.nextInt();
			saldo += n;
			
		}
		System.out.println(saldo-q*n);
	}

}
