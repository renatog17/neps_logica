package faceis.PisoDaEscola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(l*c + (l-1)*(c-1));
		System.out.println((l-1)*2 + (c-1)*2);

	}

}
