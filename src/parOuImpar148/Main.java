package parOuImpar148;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((c+b)%2 == 1)	System.out.println("Cino");
		else System.out.println("Bino");
	}

}
