package obi2023.primeirafase.premio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int d = sc.nextInt()*2;
		int b = sc.nextInt()*3;
		
		int soma = p+d+b;
		if(soma>=150) System.out.println("B");
		else if(soma>=120) System.out.println("D");
		else if(soma>=100) System.out.println("P");
		else System.out.println("N");
	}

}
