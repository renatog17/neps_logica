package obi2015.primeirafase.fitacolorida;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 0;

		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if (aux == -1) {
				cont++;
			} else {
				fila.add(cont);
				cont = 0;
			}
		}
		// fila.add(cont);
		//
		Integer poll = fila.poll();
		for (int i = 0; i < poll; i++) {
			if (poll - i > 9)
				System.out.print(9 + " ");
			else
				System.out.print(poll - i + " ");
		}
		while (!fila.isEmpty()) {
			System.out.print(0 + " ");
			Integer poll2 = fila.poll();
			if (poll2 % 2 == 1) {
				int limite = poll2 / 2;
				for (int i = 1; i <= limite; i++) {
					if (i > 9) {
						System.out.print(9 + " ");
					} else {
						System.out.print(i + " ");
					}
				}
				if (limite + 1 > 9)
					System.out.print(9+" ");
				else
					System.out.print(limite + 1 + " ");
				for (int i = 0; i < limite; i++) {
					if (limite - i > 9)
						System.out.print(9+" ");
					else
						System.out.print(limite - i + " ");
				}
			} else {
				int limite = poll2 / 2;
				for (int i = 1; i <= limite; i++) {
					if (i > 9) {
						System.out.print(9 + " ");
					} else {
						System.out.print(i + " ");
					}
				}

				for (int i = 0; i < limite; i++) {
					if (limite - i > 9)
						System.out.print(9+" ");
					else
						System.out.print(limite - i + " ");
				}
			}

		}

		for (int i = 0; i <= cont; i++) {
			if (i > 9)
				System.out.print(9 + " ");
			else
				System.out.print(i + " ");
		}
	}

}
