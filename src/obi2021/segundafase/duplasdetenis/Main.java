package obi2021.segundafase.duplasdetenis;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a + d > c + b)
			System.out.println((a + d)-(c+b));
		else
			System.out.println((c + b)-(a+d));
	}

}
