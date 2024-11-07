package obi2012.segundafase.tirateima;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a<0 || a>432) ||(b<0 || b>468)) {
			System.out.println("fora");
		}else {
			System.out.println("dentro");
		}
	}

}
