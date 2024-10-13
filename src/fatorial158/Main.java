package fatorial158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = 1;
		if(n==0) System.out.println(1);
		else {
			for (int i = 1; i <= n; i++) {
				fatorial = i*fatorial;
			}
			System.out.println(fatorial);
		}
	}

}
