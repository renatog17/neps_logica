package garcom324;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int l;
		int c;
		int tc= 0;
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			c = sc.nextInt();
			if((l>c)) {
				tc = tc + c;
			}
		}
		System.out.println(tc);
	}

}
