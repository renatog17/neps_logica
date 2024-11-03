package obi2020.primeirafase.a.pilotoautomatico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (c - b == b - a)
			System.out.println(0);
		else {
			if (c - b > b - a) {
				System.out.println(1);
			} else {
				System.out.println(-1);
			}
		}
	}

}
