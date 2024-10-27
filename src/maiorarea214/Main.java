package maiorarea214;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int area = l*b;
		int l2 = sc.nextInt();
		int b2 = sc.nextInt();
		int area2 = l2*b2;
		if(area>area2) {
			System.out.println("Primeiro");
		}else if(area2>area) {
			System.out.println("Segundo");
		}else {
			System.out.println("Empate");
		}
	}

}
