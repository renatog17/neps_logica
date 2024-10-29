package obi2023.primeirafase.leilao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String nomeMaiorLance = "";
		int maiorLance = 0;
		for (int j = 0; j < i; j++) {
			String nome = sc.next();
			int lance = sc.nextInt();
			if(lance>maiorLance) {
				nomeMaiorLance = nome;
				maiorLance = lance;
			}
			
		}
		System.out.println(nomeMaiorLance);
		System.out.println(maiorLance);
	}

}
