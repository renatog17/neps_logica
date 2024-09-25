package QuantasLetras;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra = sc.next();
		String letra = sc.next();
		int qtdLetras = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.substring(i,i+1).equals(letra)) {
				qtdLetras++;
			}
		}
		System.out.println(qtdLetras);
	}

}
