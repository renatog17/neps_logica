package faceis.ACamaradagemDoRingue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int p = sc.nextInt();
		int socos = sc.nextInt();
		int cont = 0;
		for (int i = 0; i < socos; i++) {
			int soco = sc.nextInt();
			if(soco>=c && soco<=p) cont++;
		}
		System.out.println(cont);
	}

}
