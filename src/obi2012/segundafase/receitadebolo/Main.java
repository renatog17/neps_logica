package obi2012.segundafase.receitadebolo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a /= 2;
		b /= 3;
		c /= 5;
		
		System.out.println(Math.min(a, Math.min(b, c)));
	}

}
