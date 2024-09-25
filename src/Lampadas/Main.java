package Lampadas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();

		Boolean stateA = false;
		Boolean stateB = false;

		for (int i = 0; i < n; i++) {
			if (stateA)
				stateA = false;
			else
				stateA = true;
			if (sc.nextInt() == 2) {
				if (stateB)
					stateB = false;
				else
					stateB = true;
			}
			if (stateA)
				System.out.println(1);
			else
				System.out.println(0);

			if (stateB)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
