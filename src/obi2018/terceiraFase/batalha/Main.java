package obi2018.terceiraFase.batalha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int d1 = sc.nextInt();
		int a2 = sc.nextInt();
		int d2 = sc.nextInt();
		
		if(a1==d2 & a2==d1) System.out.println(-1);
		else if(a1!=d2 & a2!=d1) System.out.println(-1);
		else if(a1==d2) System.out.println(2);
		else System.out.println(1);

	}

}
