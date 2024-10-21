package obi2023.primeirafase.epidemia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int p = sc.nextInt();
	
		int somaN=n;
		int cont = 0;
		
		while(somaN<p) {
			n = n*r;
			somaN += n;
			cont++;
		}
		//cont--;
		System.out.println(cont);
	}

}
