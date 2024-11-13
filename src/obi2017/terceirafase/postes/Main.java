package obi2017.terceirafase.postes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int contA = 0;
		int contB = 0;
		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if (aux < 50) {
				contA++;
			} else if (aux < 85) {
				contB++;
			}
		}
		
		System.out.println(contA + " "+ contB);
	}

}
