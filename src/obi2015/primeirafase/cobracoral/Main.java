package obi2015.primeirafase.cobracoral;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c [] = new int[4];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		if(c[0]==c[3]) System.out.println("F");
		else System.out.println("V");

	}

}
