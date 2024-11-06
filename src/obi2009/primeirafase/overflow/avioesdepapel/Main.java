package obi2009.primeirafase.overflow.avioesdepapel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int p = sc.nextInt();
		int f = sc.nextInt();
		
		if(p/c >= f)System.out.println("S");
		else System.out.println("N");
	}

}
