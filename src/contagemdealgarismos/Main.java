package contagemdealgarismos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[11];
		String s = "";
		for (int i = 0; i < n; i++) {
			String aux = sc.next();
			for (int j = 0; j < aux.length(); j++) {
				int auxN = Integer.parseInt(aux.substring(j, j+1));
				v[auxN]++;
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" - "+v[i]);
		}
	}
}
