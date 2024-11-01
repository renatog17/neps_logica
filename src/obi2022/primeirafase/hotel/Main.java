package obi2022.primeirafase.hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int a = sc.nextInt();
		int n = sc.nextInt();
		
		int qtdDias = 32-n;
		
		int aumento;
		
		if(31-qtdDias>=15) {
			aumento = 14*a;
		}else {
			aumento = (31-qtdDias)*a;
		}
		
		System.out.println((d+aumento)*qtdDias);
	}
}
