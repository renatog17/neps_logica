package obi2023.segundafasea.pizzadaobi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int g = sc.nextInt()*8;
		int m = sc.nextInt()*6;
		if(g+m > n) System.out.println((g+m)-n);
		else System.out.println(0);
	}

}
