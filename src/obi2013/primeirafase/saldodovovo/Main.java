package obi2013.primeirafase.saldodovovo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Integer s = sc.nextInt();
		
		Integer sv = 10000;
		
		for (int i = 0; i < n; i++) {
			s += sc.nextInt();
			if(s<sv) sv = s;
		}
		
		System.out.println(sv);
	}

}
