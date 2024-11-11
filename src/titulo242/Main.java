package titulo242;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().toLowerCase().split(" ");
		for (int i = 0; i < s.length; i++) {
			String palavra = s[i];
			palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1);
			System.out.print(palavra+" ");
		}
	}

}
