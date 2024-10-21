package sbc2023.alturaminima;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdBrinqudos = sc.nextInt();
		int altura = sc.nextInt();
		int cont = 0;
		for (int i = 0; i < qtdBrinqudos; i++) {
			if(sc.nextInt()<=altura) cont++;
		}
		System.out.println(cont);
	}

}
