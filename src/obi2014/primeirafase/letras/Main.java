package obi2014.primeirafase.letras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra = sc.nextLine();
		String palavras = sc.nextLine();
		
		String[] split = palavras.split(" ");
		
		int total = 0;
		
		for (int i = 0; i < split.length; i++) {
			if(split[i].contains(letra)) {
				total++;
			}
		}
		
		System.out.println(String.format("%.1f", (double)(100 * total) / split.length));

	}

}
