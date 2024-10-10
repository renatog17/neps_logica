package obi2018.primeirafase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=800) System.out.println(1);
		else if(n<=1400) System.out.println(2);
		else System.out.println(3);
	}

}
