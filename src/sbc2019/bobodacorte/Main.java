package sbc2019.bobodacorte;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String saida = "S";
		int c = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if(sc.nextInt()>c) {
				saida = "N";
			}
		}
		System.out.println(saida);
	}
}
