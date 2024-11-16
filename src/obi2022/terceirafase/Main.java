package obi2022.terceirafase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(true) {
			int aux = sc.nextInt();
			if(n<aux) {
				System.out.println("menor");
			}else if(n>aux) {
				System.out.println("maior");
			}else {
				System.out.println("correto");
				break;
			}
		}
	}

}
