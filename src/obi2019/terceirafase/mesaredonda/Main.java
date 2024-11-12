package obi2019.terceirafase.mesaredonda;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int amod3 = a%3;
		int bmod3 = b%3;
		
		if(bmod3==amod3) {
			bmod3++;
		}
		
		if(bmod3>=3)
			bmod3 = bmod3%3;
//		System.out.println(amod3);
//		System.out.println(bmod3);
		
		System.out.println(3-(amod3+bmod3));
		
	}

}
