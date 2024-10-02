package faceis.Vestibular;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String e = sc.next();
		String gabarito = sc.next();
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if(e.substring(i, i+1).equals(gabarito.substring(i, i+1))) {
				cont++;
			}
			
		}
		System.out.println(cont);
	}

}
