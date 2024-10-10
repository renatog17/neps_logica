package obi2016.primeirafase.plantacaodemorangos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l1 = sc.nextInt();
		int c1 = sc.nextInt();
		int l2 = sc.nextInt();
		int c2 = sc.nextInt();
		if(l1*c1 > l2*c2) System.out.println(l1*c1);
		else System.out.println(l2*c2);
	}

}
