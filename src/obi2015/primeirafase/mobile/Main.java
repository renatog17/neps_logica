package obi2015.primeirafase.mobile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a == (b + c + d) && d == (c + b) && b==c) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
