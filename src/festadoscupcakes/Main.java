package festadoscupcakes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt() * 8;
		int s = sc.nextInt() * 3;
		System.out.println((r+s)-28);
	}

}
