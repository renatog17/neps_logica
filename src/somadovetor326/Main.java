package somadovetor326;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int r = 0;
		for (int i = 0; i < n; i++) {
			r += sc.nextInt();
		}
		System.out.println(r);
	}

}
