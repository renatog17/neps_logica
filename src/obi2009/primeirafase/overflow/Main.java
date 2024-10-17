package obi2009.primeirafase.overflow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		String o = sc.next();
		int b = sc.nextInt();
		
		if(o.equals("+")) {
			if(a+b <= n) System.out.println("OK");
			else System.out.println("OVERFLOW");
		}else {
			if(a*b <= n) System.out.println("OK");
			else System.out.println("OVERFLOW");
		}

	}

}
