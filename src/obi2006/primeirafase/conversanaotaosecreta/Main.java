package obi2006.primeirafase.conversanaotaosecreta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();

		int k = sc.nextInt();

		int inicioN = 0;
		int inicioM = 0;

		int saida = 0;
//		if (inicioM == x || inicioM == x - 1 || inicioM == x + 1) {
//			if (inicioN == y || inicioN == y - 1 || inicioN == y + 1) {
//				saida++;
//			}
//		}
		

		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			if (c == 1) {
				inicioM++;
			} else if (c == 2) {
				inicioM--;
			} else if (c == 3) {
				inicioN++;
			} else {
				inicioN--;
			}
//			System.out.println(inicioM + " " + inicioN);

//			if (inicioM < 0 || inicioN < 0 || inicioN > n || inicioM > m) {
//
//			} else {
				
				if (inicioM == y || inicioM == (y - 1) || inicioM == (y + 1)) {
					if (inicioN == x || inicioN == (x - 1) || inicioN == (x + 1)) {
						saida++;
					}
				}
//			}
		}
		System.out.println(saida);
	}

}
