package faceis.EPrimo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		boolean isPrimo = true;

		if (n < 2) {
			isPrimo = false; // Números menores que 2 não são primos
		} else if (n == 2) {
			isPrimo = true; // 2 é o único número primo par
		} else if (n % 2 == 0) {
			isPrimo = false; // Números pares maiores que 2 não são primos
		} else {
			for (long i = 3; i * i <= n; i += 2) {
				if (n % i == 0) {
					isPrimo = false;
					break;
				}
			}
		}

		if (isPrimo)
			System.out.println("S");
		else
			System.out.println("N");
	}

}
