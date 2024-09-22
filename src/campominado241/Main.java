package campominado241;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			int aux = sc.nextInt();
			if (aux == 1) {

				if (i == 0) {
					num[i]++;
					num[i + 1]++;
				} else {
					if (i == n - 1) {
						num[i]++;
						num[i - 1]++;
					} else {
						num[i]++;
						num[i + 1]++;
						num[i - 1]++;
					}
				}
			}
		}
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}

	}

}
