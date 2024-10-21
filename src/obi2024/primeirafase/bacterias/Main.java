package obi2024.primeirafase.bacterias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		int start = 1;
		int cont = 0;
		while (true) {
			int aux = (int) Math.pow(start, p);
			cont ++;
			if(start>n) {
				break;
			}else {
				start += aux;
			}
		}
		System.out.println(cont);
	}

}
