package sbc2016.andandonotempo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b || a == c || b == c)
			System.out.println("S");
		else if (a == b + c) {
			System.out.println("S");
		} else if (b == c + a) {
			System.out.println("S");
		} else if (c == a + b) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}
