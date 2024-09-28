package NotasDaProva;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1) System.out.println("E");
		else if(n<36) System.out.println("D");
		else if(n<61) System.out.println("C");
		else if(n<86) System.out.println("B");
		else System.out.println("A");

	}

}
