package obi2024.segundafasea.cubopreto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=3) {
			System.out.println((int)Math.pow(n-2, 3));
			System.out.println((n-2)*(n-2)*6);
			System.out.println((n-2)*12);
			System.out.println(8);
		}else {
			System.out.println(0);
			System.out.println(0);
			System.out.println(0);
			System.out.println(8);
		}
		//System.out.println((n)*6);
	}

}
