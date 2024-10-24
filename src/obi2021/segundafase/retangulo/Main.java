package obi2021.segundafase.retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	//fica pra uma outra hora
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> posicoes = new ArrayList<>();
		posicoes.add(0);
		int sum = 0;
		if (n % 2 == 1)
			System.out.println("N");
		else {
			for (int i = 0; i < n; i++) {
				int aux = sc.nextInt();
				sum += aux;
				posicoes.add(sum);
			}

			int cont = 0;

			for (Integer integer : posicoes) {
//				System.out.println(integer);
				if (posicoes.contains(integer / 2)) {
					cont++;
				}
			}
			if (cont > 2)
				System.out.println("S");
			else
				System.out.println("N");
		}

	}

}
