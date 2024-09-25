package Raizes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			System.out.printf("%.4f%n", Math.sqrt(sc.nextDouble()));
		}

	}

}
