package obi2021.primeirafase.tempoderesposta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[100 + 1];
		int ativo[] = new int[100 + 1];
		for (int i = 0; i < n; i++) {
			int time = 1;
			String aux = sc.next();
			int indiceAux = sc.nextInt();
			if (aux.equals("R")) {
				ativo[indiceAux] = 1;
			} else if (aux.equals("E")) {
				ativo[indiceAux] = 0;
			} else if (aux.equals("T")) {
				time = indiceAux-1;
			}

			for (int j = 1; j < a.length; j++) {
				if (ativo[j] == 1)
					a[j] += time;
			}
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.print(i + " ");
				if(ativo[i]==1) {
					System.out.println(-1);
				}else {
					System.out.println(a[i]);
				}
			}
		}
	}

}
