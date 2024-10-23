package obi2021.segundafase.mediaemediana;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int p = (a+b)/2;
		int s = -b+(2*a);
		int t = -a+(2*b);
		
		System.out.println(Math.min(p, Math.min(s, t)));
	}

}
