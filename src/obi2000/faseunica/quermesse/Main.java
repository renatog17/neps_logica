package obi2000.faseunica.quermesse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contTeste = 1 ;
		while (true) {
			int n = sc.nextInt();
			if(n==0) break;
			for (int i = 1; i <= n; i++) {
				if (sc.nextInt() == i) {
					System.out.println("Teste "+contTeste+"\n"+i+"\n");
					contTeste++;
				}
			}
		}

	}

}
