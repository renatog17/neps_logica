package obi2015.segundafase.impedido;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();

		if(r>50 && l<r && r>d) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
	}

}
