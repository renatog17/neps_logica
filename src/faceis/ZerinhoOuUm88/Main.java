package faceis.ZerinhoOuUm88;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a==b && b==c) {
			System.out.println("*");
		}else {
			if(a==b) {
				System.out.println("C");
			}else {
				if(b==c) {
					System.out.println("A");
				}else {
					System.out.println("B");
				}
			}
		}
	}
}
