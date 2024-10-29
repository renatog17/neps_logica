package obi2023.primeirafase.contasapagar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		
		if(c1+c2+c3<=n) {
			System.out.println(3);
		}else {
			if(c1+c2 <= n || c1+c3<=n || c2+c3<=n) {
				System.out.println(2);
			}else {
				if(c1 <= n || c2<=n||c3<=n) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}
		}
	}

}
