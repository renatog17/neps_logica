package obi2024.primeirafase.ogro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int d = sc.nextInt();
		if(e>d) System.out.println(e+d);
		else System.out.println(2*(d-e));
	}

}
