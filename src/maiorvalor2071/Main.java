package maiorvalor2071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int saida = -1;
		for (int i = n; i <= m; i++) {
			int sum = 0;
			int aux = i;
			while (aux > 0) {
			    int algarismo = aux % 10; // Extrai o último algarismo
			    sum += algarismo;
			    aux /= 10; // Remove o último algarismo
			}
			if(sum==s) {
				saida = i;
			}
		}

		System.out.println(saida);
	}

}
