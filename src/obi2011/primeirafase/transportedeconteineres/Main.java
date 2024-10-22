package obi2011.primeirafase.transportedeconteineres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		System.out.println((x/a)*(y/b)*(z/c));
	}

}
